import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListsTest {
  public static void main(String[] args) {

    ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(7, 2, 3, 4, 5));
    System.out.println(newList);

    ArrayList<Integer> newListSorted = new ArrayList<>();

    System.out.println(newList);
  }
}
