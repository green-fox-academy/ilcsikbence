public class Gnirts implements CharSequence {

  String toBeSequenced;

  public Gnirts (String toBeSequenced) {
    this.toBeSequenced = toBeSequenced;
  }

  @Override
  public int length() {
    return toBeSequenced.length();
  }

  @Override
  public char charAt(int index) {
    String reversed = new StringBuilder(toBeSequenced).reverse().toString();
    return reversed.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String reversed = new StringBuilder(toBeSequenced).reverse().toString();
    return reversed.substring(start, end);
  }
}