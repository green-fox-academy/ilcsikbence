import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    makingMatches(girls, boys);

  }

  public static void makingMatches(ArrayList girls, ArrayList boys) {

    int arraySize = girls.size();

    for (int i = 0; i < girls.size(); i++) {
      if (i < arraySize - 1) {
        System.out.print("\"");
        System.out.print(girls.get(i));
        System.out.print("\", \"");
        System.out.print(boys.get(i));
        System.out.print("\", ");
      } else {
        System.out.print("\"");
        System.out.print(girls.get(i));
        System.out.print("\", \"");
        System.out.print(boys.get(i));
        System.out.print("\"");
      }
    }


  }


}