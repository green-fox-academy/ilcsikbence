import java.util.ArrayList;
import java.util.EmptyStackException;

public class Carrier {

  int initAmmo;
  int healthPoint;
  ArrayList<Aircraft> carrierArray = new ArrayList<>();
  int totalDMG = totalDamage(carrierArray);


  public Carrier(int initAmmo, int healthPoint){
    this.initAmmo = initAmmo;
    this.healthPoint = healthPoint;
  }

  public ArrayList<Aircraft> add(Aircraft aircraft) {
    carrierArray.add(aircraft);
    return carrierArray;
  }

  public void fill() {

    if (initAmmo > 0) {

      if (initAmmo > enoughAmmo(carrierArray)) {
        for (int i = 0; i < carrierArray.size(); i++) {
          initAmmo = carrierArray.get(i).refill(initAmmo);
        }
      } else {
        for (int i = 0; i < carrierArray.size(); i++) {
          if (carrierArray.get(i).isPriority() == true) {
            initAmmo = carrierArray.get(i).refill(initAmmo);
          } else {
            initAmmo = carrierArray.get(i).refill(initAmmo);
          }
        }
      }
    } else throw new EmptyStackException();
  }

  public int enoughAmmo(ArrayList<Aircraft> carrierArray) {
    this.carrierArray = carrierArray;
    int zero = 0;
    for (int i = 0; i < carrierArray.size(); i++) {
      zero += carrierArray.get(i).maxAmmo;
    }
    return zero;
  }

  public int totalDamage(ArrayList<Aircraft> carrierArray) {
    this.carrierArray = carrierArray;
    int zero = 0;
    for (int i = 0; i < carrierArray.size(); i++) {
      zero += carrierArray.get(i).damageAll;
    }
    return zero;
  }

  public void getStatus() {
    if (healthPoint > 0) {
      System.out.println("HP: " + healthPoint + ", Aircraft count: " + carrierArray.size() + ", Ammo Storage: " + initAmmo + ", Total Damage: " + totalDamage(carrierArray));
      System.out.println("Aircrafts:");
      for (int i = 0; i < carrierArray.size(); i++) {
        System.out.println(carrierArray.get(i).getStatus());
      }
    } else {
        System.out.println("It's dead Jim :(");
    }
  }

  public int fight(Carrier carrier) {

    this.totalDMG = totalDMG;
    int newHP = carrier.healthPoint - totalDMG;
    return newHP;


  }
}
