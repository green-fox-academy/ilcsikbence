import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  Fibonacci fibonacci = new Fibonacci();

  @Test
  public void fibonacciWithZero() {
    System.out.println(fibonacci.fibonacci(0));
  }

  @Test
  public void fibonacciWithIndexOfThree() {
    System.out.println(fibonacci.fibonacci(3));
  }

  @Test
  public void fibonacciWithHighNumber() {
    System.out.println(fibonacci.fibonacci(16));
  }
}