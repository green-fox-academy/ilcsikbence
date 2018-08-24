import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anagram = new Anagram();

  @Test
  public void anagram() {
    String string1 = "abba";
    String string2 = "baba";
    assertEquals(true, anagram.anagram(string1, string2));
  }
}