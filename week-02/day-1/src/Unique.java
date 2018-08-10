import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
//    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

    List<Integer> numberList1 = new ArrayList<>();
    numberList1.addAll(Arrays.asList(1, 3, 2, 3, 3, 4, 2, 7, 8, 1, 2));
    Collections.sort(numberList1);

    System.out.println(returnedValue((ArrayList) numberList1));
  }

  public static ArrayList returnedValue(ArrayList numberList1){


    ArrayList<Integer> sortedList = new ArrayList<Integer>(numberList1);

    for (int i = 0; i < sortedList.size() - 1; i++) {
      for (int j = 0; j < sortedList.size() - 2; j++) {
        if (sortedList.get(j + 1) == sortedList.get(i)) {
          sortedList.remove(i);
        }
      }
    }

    return sortedList;

  }
}