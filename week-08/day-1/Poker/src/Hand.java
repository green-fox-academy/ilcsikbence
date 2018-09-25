public class Hand {
  Card[] cards;

  public Hand(String input) {
    this.cards = new Card[5];
    this.cards = getCards(input);
  }

  public Card[] getCards(String input) {
    for (int i = 0; i < cards.length; i++) {
      cards[i] = new Card(input.split(" ")[i]);
    }
    return cards;
  }

  public Card getOneCardFromArray(int i) {
    return cards[i];
  }
}