import java.nio.file.Path;

public class Main {
  public static void main(String[] args) {

    Pirate cptSparrow = new Pirate();
    Parrot parrot = new Parrot();

    for (int i = 1; i <= 6; i++) {
      if (i <= 5) {
        cptSparrow.drinkSomeRum();
        System.out.println(cptSparrow.howsItGoingMate());
      }
      if (i < 5) {
        parrot.repeatsHows();
      }
    }
    cptSparrow.drinkSomeRum();
    cptSparrow.drinkSomeRum();
    cptSparrow.drinkSomeRum();

    cptSparrow.die();

  }
}
