import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrier extends Fightable implements Movable {
  private int storedAmmo;
  private List<Movable> movables;

  public Carrier(int healthPoint, int storedAmmo) {
    super(healthPoint);
    this.storedAmmo = storedAmmo;
    this.movables = new ArrayList<>();
  }

  public void addMovable(Movable movable) {
    this.movables.add(movable);
  }

  public void reloadAll() {
    if (storedAmmo > 0) {
      movables.stream()
          .filter(Reloadable.class::isInstance)
          .map(Reloadable.class::cast)
          .forEach(movable -> storedAmmo = movable.reload(storedAmmo));
    }
  }

  public Map<String, String> getStatus() throws IllegalAccessException {
    Map<String, String> fields = new HashMap<>();
    fields.put("type", this.getClass().getName());
    getFields(fields, this.getClass());

    return fields;
  }

  public Map<String, String> getFields(Map<String, String> fields, Class<?> current) throws IllegalAccessException {
    if (current.getSuperclass() != null) {
      for (Field field : current.getDeclaredFields()) {
        fields.put(field.getName(), field.get(this) + "");
      }
      current = current.getSuperclass();
      getFields(fields, current);
    }

    return fields;
  }

  public void readStatus() {
    try {
      getStatus().forEach((s, s2) -> System.out.println(s + ": " + s2));
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void fight(Fightable fightable) {
    movables.stream()
        .filter(CanShoot.class::isInstance)
        .map(CanShoot.class::cast)
        .forEach(canShoot -> fightable.healthPoint -= canShoot.fight());
  }

  public int getStoredAmmo() {
    return storedAmmo;
  }

  public void setStoredAmmo(int storedAmmo) {
    this.storedAmmo = storedAmmo;
  }


  public List<Movable> getMovables() {
    return movables;
  }

  public void setMovables(List<Movable> movables) {
    this.movables = movables;
  }
}
