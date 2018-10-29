public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println(createPalindrome("palindrome"));
  }

  public static String createPalindrome(String s) {

    char[] chars = s.toCharArray();
    String palindrome = "";
    for (int i = 0; i < chars.length; i++) {
      palindrome += chars[i];
    }

    for (int i = chars.length - 1; i >= 0; i--) {
      palindrome += chars[i];
    }

    return palindrome;
  }
}
