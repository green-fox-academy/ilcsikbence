public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("dog", "god"));
    System.out.println(isAnagram("green", "fox"));
  }

  public static boolean isAnagram(String input1, String input2) {
    char[] chars = input2.toCharArray();
    String reverse = "";
    for (int i = chars.length - 1; i >= 0; i--) {
      reverse += chars[i];
    }

    if (input1.equals(reverse)) {
      return true;
    }
    return false;
  }
}
