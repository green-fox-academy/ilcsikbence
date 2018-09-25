import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LogicBoard {
  Hand hand = new Hand("QH 2H 7D AC TS");
  Hand hand2 = new Hand("1H 2H 3H 5H 4H");
  int cardsRating;


  public int royalFlush(Hand hand) {
    List<Integer> valueOfRoyalFlushList = Arrays.asList(10, 11, 12, 13, 14);
    Collections.sort(getValueListOfCards());
    for (int i = 0; i < hand.cards.length; i++) {
      if (hand.cards[0].getColor().equals(hand.cards[i].getColor())) {
        if (hand.cards[0].getValue() == valueOfRoyalFlushList.get(i)) {
          return 10;
        }
      }
    }
    return 0;
  }

  public List<Integer> getValueListOfCards() {
    List<Integer> tempValueList = new ArrayList<>();
    for (int i = 0; i < hand.cards.length; i++) {
      tempValueList.add(i, hand.cards[i].getValue());
    }
    return tempValueList;
  }
}
