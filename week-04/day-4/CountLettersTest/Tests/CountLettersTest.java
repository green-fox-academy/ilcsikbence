import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

  CountLetters countLetters = new CountLetters();

  @Test
  public void countLetters() {
    countLetters.countLetters("aaaabbbccd");
  }

}