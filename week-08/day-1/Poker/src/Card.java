import java.util.HashMap;

public class Card {
  HashMap<String, Integer> hashMap = new HashMap<>();
  int value;
  String color;

  public Card(String input) {
    value = valuesToInt(input);
    color = input.split("")[1];
  }

  public int valuesToInt(String input) {
    return valuesToMap().get(input.split("")[0]);
  }

  public HashMap<String, Integer> valuesToMap() {
    this.hashMap.put("1", 1);
    this.hashMap.put("2", 2);
    this.hashMap.put("3", 3);
    this.hashMap.put("4", 4);
    this.hashMap.put("5", 5);
    this.hashMap.put("6", 6);
    this.hashMap.put("7", 7);
    this.hashMap.put("8", 8);
    this.hashMap.put("9", 9);
    this.hashMap.put("T", 10);
    this.hashMap.put("J", 11);
    this.hashMap.put("Q", 12);
    this.hashMap.put("K", 13);
    this.hashMap.put("A", 14);
    return this.hashMap;
  }

  public int getValue() {
    return value;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return value + color;
  }
}