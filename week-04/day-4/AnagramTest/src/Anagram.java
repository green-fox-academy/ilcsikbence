import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

  String string1;
  String string2;

  public boolean anagram(String string1, String string2) {
    this.string1 = string1;
    this.string2 = string2;

    if (string1.length() != string2.length()) {
      return false;
    } else {
      ArrayList<String> anagram1 = new ArrayList<>(Arrays.asList(string1.split("")));
      ArrayList<String> anagram2 = new ArrayList<>(Arrays.asList(string2.split("")));

      return (anagram1.containsAll(anagram2) && anagram2.containsAll(anagram1));
    }
  }
}