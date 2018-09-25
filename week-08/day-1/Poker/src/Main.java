public class Main {


  public static void main(String[] args) {
    LogicBoard logicBoard = new LogicBoard();

    Card card = new Card("2H");
    Hand hand = new Hand("QH 2H 7D AC TS");
    Hand handFlush = new Hand("TH JH QH KD AD");
    System.out.println(card.getColor());
    System.out.println(card.getValue());

    System.out.println(logicBoard.royalFlush(hand));
    System.out.println(logicBoard.royalFlush(handFlush));
  }
}
