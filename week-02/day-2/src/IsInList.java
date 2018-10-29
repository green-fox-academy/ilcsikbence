import java.util.*;

public class IsInList{
  public static void main(String... args){
    // Check if list contains all of the following elements: 4,8,12,16
    // Create a method that accepts list as an input
    // it should return "true" if it contains all, otherwise "false"

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    ArrayList<Integer> containList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
    checkNums(list, containList);

  }

  public static void checkNums(ArrayList list, ArrayList containList){
    boolean booleanList = list.containsAll(containList);
    System.out.println(booleanList);

  }
}