package com.greenfoxacademy;

public class M1Abrams extends Tank {
  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;

  public M1Abrams(int currentAmmo, int maxAmmo, int baseDamage) {
    this.currentAmmo = currentAmmo;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

  @Override
  public int reload(int ammo) {
    if (ammo > maxAmmo) {
      return calculateDifference(ammo);
    }

    currentAmmo = ammo;
    return 0;

  }

  public int calculateDifference(int ammo) {
    int difference = maxAmmo - currentAmmo;
    currentAmmo = maxAmmo;
    return ammo - difference;
  }

  @Override
  public int fight() {
    int damage = currentAmmo + 2 * baseDamage;
    currentAmmo = 0;
    return damage;
  }

}
