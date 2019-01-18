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

  @After
  public void destroy() {
    dog = null;
  }

}