import java.util.*;
import java.util.stream.Collectors;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
//    quoteSwap(list);
    // Expected output: "What I cannot create I do not understand."

    System.out.println(quoteSwap(list));


  }

  public static ArrayList quoteSwap (ArrayList list){

//    String word1 = list.get(2).toString();
//    String word2 = list.get(5).toString();
//
//    list.set(2, word2);
//    list.set(5, word1);

    Collections.swap(list, 2, 5);

//    for (int i = 0; i < list.size(); i++) {
//      System.out.print(list.get(i));
//    }

    return list;
  }
}