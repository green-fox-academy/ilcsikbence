import org.junit.Test;
import static org.junit.Assert.*;

public class AppleTest {

  Apple apple = new Apple();

  @Test
  public void getAppleIfStringIsApple() {
    assertEquals("apple", apple.getApple());
  }

  @Test
  public void failIfStringIsApple() {
    assertEquals("not an apple", apple.getApple());
  }
}