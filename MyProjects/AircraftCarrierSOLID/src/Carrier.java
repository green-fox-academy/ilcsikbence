import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrier implements Movable, Fightable {
  private int storedAmmo;
  private int healthPoint;
  private List<Movable> movables;

  public Carrier(int storedAmmo, int healthPoint) {
    this.storedAmmo = storedAmmo;
    this.healthPoint = healthPoint;
    this.movables = new ArrayList<>();
  }

  public Carrier() {
  }

  public void addMovable(Movable movable) {
    this.movables.add(movable);
  }

  public void refill() {
    if (storedAmmo > 0) {
      movables.stream()
          .filter(Fillable.class::isInstance)
          .map(Fillable.class::cast)
          .forEach(movable -> movable.fill(storedAmmo));
    }
  }


  public Map<String, String> getStatus() {
    Map<String, String> status = new HashMap<>();
    for (Field field : Carrier.class.getDeclaredFields()) {
      try {
        status.put(field.getName(), field.get(this) + "");
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    return status;
  }

  public int getStoredAmmo() {
    return storedAmmo;
  }

  public void setStoredAmmo(int storedAmmo) {
    this.storedAmmo = storedAmmo;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }

}
