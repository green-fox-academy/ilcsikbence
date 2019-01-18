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

  @After
  public void destroy() {
    dog = null;
  }

}