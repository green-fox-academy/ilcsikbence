public class Aircraft {
  int currentAmmo;
  int maxAmmo;
  int baseDamage;
  int damageAll;
  String type;
  boolean fillQueue;

  public Aircraft(int currentAmmo, int maxAmmo, int baseDamage, int damageAll) {
    this.currentAmmo = currentAmmo;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.damageAll = damageAll;
  }

  public void fight() {
    damageAll = this.baseDamage * currentAmmo;
    currentAmmo = 0;
  }

  public int refill(int ammoAdded) {
    int toFill = maxAmmo - currentAmmo;

    if (ammoAdded <= toFill) {
      currentAmmo = ammoAdded;
    } else {
      currentAmmo = maxAmmo;
    }

    ammoAdded = ammoAdded - toFill;
    if (ammoAdded > 0) {
      return ammoAdded;
    } else {
      return 0;
    }
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + damageAll;
  }

  public boolean isPriority() {
    return fillQueue;
  }
}