import org.junit.Assert;
import org.junit.Test;

public class TrickyAverageTest {
  int test1[] = {1, 3, 4, 28, 2, 3};
  int test2[] = {1, 1, 8, 10, 12, 3};

  TrickyAverage trickyAverage = new TrickyAverage();

  @Test
  public void getTrickyAvg_testCase1() {
    Assert.assertEquals(14.5, trickyAverage.getTrickyAvg(test1), 0);
  }

  @Test
  public void getTrickyAvg_testCase2() {
    Assert.assertEquals(6.5, trickyAverage.getTrickyAvg(test2), 0);
  }
}