package com.greenfoxacademy;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class FighterJet extends Aircraft implements Reloadable, CanShoot {
  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;

  public FighterJet(int currentAmmo, int maxAmmo, int baseDamage) {
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
    int damage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return damage;
  }

  public Map<String, String> getStatus() {
    Map<String, String> fields = new HashMap<>();
    fields.put("type", this.getClass().getSuperclass().getSimpleName());
    try {
      getFields(fields, this.getClass());
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }

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

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName() + ": ");
    getStatus().forEach((s, s2) -> stringBuilder.append(" " + s + ": " + s2 + " "));

    return stringBuilder.toString().trim();
  }

  public void readStatus() {
    StringBuilder stringBuilder = new StringBuilder();
    getStatus().forEach((s, s2) -> stringBuilder.append("[" + s + ": " + s2 + "] "));
    System.out.println(stringBuilder.toString());
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }


}
