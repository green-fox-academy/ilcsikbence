public class Shifter implements CharSequence {

  String toBeSequenced;
  int shiftNum;

  public Shifter (String toBeSequenced, int shiftNum) {
    this.toBeSequenced = toBeSequenced;
    this.shiftNum = shiftNum;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return toBeSequenced.charAt(index + shiftNum);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

}

