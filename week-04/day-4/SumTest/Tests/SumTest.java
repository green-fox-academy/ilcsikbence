import org.testng.annotations.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SumTest {

  Sum sum = new Sum();

  @Test
  public void sumOfEmptyArrayList() {
    ArrayList<Integer> arrayList = new ArrayList<>();
    assertEquals(0, sum.sum(arrayList));
  }

  @Test
  public void sumOfOneElement() {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(2);
    assertEquals(2, sum.sum(arrayList));
  }

  @Test
  public void sumOfMultipleElements() {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(2);
    arrayList.add(3);
    assertEquals(5, sum.sum(arrayList));
  }

  @Test
  public void sumOfNull() {
    ArrayList<Integer> arrayList = new ArrayList<>();
    assertEquals(null, sum.sum(arrayList));
  }
}