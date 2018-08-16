public class String1 {
  public static void main(String[] args) {
    String xToY = "xaaax this is great";
    System.out.println(recString(xToY));
  }


  public static String recString(String xToY) {

    if (xToY.length() == 0) {
      return xToY;
    } else if (xToY.startsWith("x")) {
      return "y" + recString(xToY.substring(1));
    } else {
      return xToY.charAt(0) + recString(xToY.substring(1));
    }
  }
}