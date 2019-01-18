import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

  Dog dog;

  @Before
  public void init() {
    dog = new Dog("Fluffy");
  }

  @Test
  public void testFeeding() {
    assertEquals(10, dog.getHunger());

    int expectedResult = 9;
    dog.feed();

    assertEquals(expectedResult, dog.getHunger());
  }

  @Test
  public void testWatering() {
    assertEquals(10, dog.getThirst());

    int expectedResult = 9;
    dog.water();

    assertEquals(expectedResult, dog.getThirst());
  }

  @Test
  public void testPlaying() {
    assertEquals(10, dog.getThirst());
    assertEquals(10, dog.getHunger());
    
    int expectedHunger = 11;
    int expectedThirst = 11;

    dog.play();

    assertEquals(expectedHunger, dog.getHunger());
    assertEquals(expectedThirst, dog.getThirst());
  }

  @After
  public void destroy() {
    dog = null;
  }

}