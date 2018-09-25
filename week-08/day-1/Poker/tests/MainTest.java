import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  Card card = new Card("QH");
  Hand hand = new Hand("QH 2H 7D AC TS");

  @Test
  public void getCardDetails() {
    Assert.assertEquals(12, card.getValue());
    Assert.assertEquals("H", card.getColor());
  }

  @Test
  public void getOneElementFromHand() {
    Assert.assertEquals("7D", hand.getOneCardFromArray(2).toString());
  }
}