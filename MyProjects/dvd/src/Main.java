import javax.swing.*;

public class Main {
  static Board board;

  public static void main(String[] args) {
    JFrame frame = new JFrame("DVD ScreenSaver");
    board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }
}