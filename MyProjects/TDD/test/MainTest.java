import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void testSumOfNumbers() {
    int a = 2;
    int b = 3;

    int expectedResult = 5;

    assertEquals(expectedResult, Main.sumTheseNumbers(a, b));
  }

}