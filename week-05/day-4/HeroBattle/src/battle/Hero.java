package battle;

public class Hero extends BaseHero implements Punchable {

  double motivation;

  Hero(String name) {
    super(name);
  }

  Hero(String name, double motivation) {
    super(name);
    this.motivation = motivation;
  }

  @Override
  public void punch(Punchable other) {
    if (getMotivationLevel() >= 1) {
      other.bePunched(motivation / 1.5);
    }
  }

  @Override
  public int getMotivationLevel() {
    if (motivation > 40)
      return 2;
    else if (motivation <= 40 && motivation >= 25)
      return 1;
    else return 0;
  }

  @Override
  public void bePunched(double damage) {
    double dmg = damage / motivation;
    motivation = motivation - dmg;
  }

  @Override
  public String toString() {
    if (getMotivationLevel() == 0) {
      return getName() + " is not motivated anymore.";
    } else if (getMotivationLevel() == 1) {
      return getName() + " is motivated.";
    } else {
      return getName() + " is well motivated.";
    }
  }
}
