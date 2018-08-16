public class Pirate {

  private static int rum = 0;

  public int drinkSomeRum() {
    rum += 1;
    return rum;
  }

  public String getSomeSleep() {
    return " *passes out and sleeps it off*";
  }

  public String howsItGoingMate() {
    if (rum > 4) {
      return "Arghh, I'ma Pirate. How d'ya d'ink its goin?" + getSomeSleep();
    } else {
      return "Pour me anudder!";
    }
  }

  public String die() {
    if (rum > 6) {
      return "He's dead.";
    } else {
      return howsItGoingMate();
    }
  }
}
