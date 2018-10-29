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
    quoteSwap(list);
    // Expected output: "What I cannot create I do not understand."

  }

  public static void quoteSwap (ArrayList<String> list){
    Collections.swap(list, 2, 5);
    String quote = "";
    for (int i = 0; i < list.size(); i++) {
      quote += list.get(i) + " ";
    }

    quote = quote.substring(0, quote.length() - 1);
    System.out.println(quote);
  }
}