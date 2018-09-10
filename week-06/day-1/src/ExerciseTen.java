import java.util.ArrayList;
import java.util.stream.Collectors;

public class ExerciseTen {
  public static void main(String[] args) {
    ArrayList<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Vuk", "Vulpes vulpes", "red"));
    foxes.add(new Fox("Teapot", "Alopex lagopus", "white"));
    foxes.add(new Fox("Foxy", "Urocyon", "grey"));
    foxes.add(new Fox("Big Ear", "Vulpes zerda", "cream"));
    foxes.add(new Fox("Clorox", "Pallida", "cream"));
    foxes.add(new Fox("GreenFox", "Academy", "green"));

    foxes.stream()
        .filter(fox -> fox.getColor().equals("green"))
        .forEach(fox -> System.out.println(fox.getName()));

    foxes.stream()
        .filter(fox -> fox.getColor().equals("green") || fox.getType().equals("Pallida"))
        .forEach(fox -> System.out.println(fox.getName()));
  }
}