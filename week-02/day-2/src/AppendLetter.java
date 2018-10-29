import java.util.*;

public class AppendLetter {
  public static void main(String... args) {
    ArrayList<String> far = new ArrayList<>(Arrays.asList("bo", "anacond", "koal", "pand", "zebr"));
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    // The output should be: "boa", "anaconda", "koala", "panda", "zebra"
    System.out.println(appendA(far));
    
  }

  public static ArrayList appendA(ArrayList far) {
    for (int i = 0; i < far.size(); i++) {
      String s = far.get(i).toString();
      far.set(i, s + "a");

    }
    return far;
  }

}

