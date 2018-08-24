import java.util.ArrayList;
import java.util.HashMap;

public class CountLetters {

  String string;
  ArrayList<Character> charsList = new ArrayList<>();
  HashMap<Character, Integer> hashMap = new HashMap<>();

  public void countLetters(String string) {
    this.string = string;
    for (int i = 0; i < string.length(); i++) {
      charsList.add(string.charAt(i));
    }

    for (Character c : charsList) {
      if (hashMap.containsKey(c)) {
        hashMap.put(c, hashMap.get(c) + 1);
      } else {
        hashMap.put(c, 1);
      }
    }
      System.out.println(hashMap);
  }
}