import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrier implements Movable {
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
