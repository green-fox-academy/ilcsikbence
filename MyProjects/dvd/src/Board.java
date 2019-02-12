import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class Board extends JComponent implements KeyListener, ActionListener {

  Timer timer = new Timer(60, this);
  DVDIcon dvdIcon;
  Movable movable;
  static int counter;
  String direction = "";
  public static final int WINDOW_WIDTH = 720;
  public static final int WINDOW_HEIGHT = 576;
  private Map<String, Direction> directionHashMap = new HashMap<String, Direction>() {
    {
      put("SE", () -> southEast());
    }
  };


  public Board() {
    timer.start();
    dvdIcon = new DVDIcon("img/1.png", 80, 4);

    setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
    setVisible(true);

  }

  public void actionPerformed(ActionEvent ev) {
    if (ev.getSource() == timer) {
      if (direction.equals("SE")) {
        direction = movable.action(dvdIcon, counter, direction);
      }
    }

    repaint();
  }

  public void changeDirection(String direction) {

  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
    dvdIcon.draw(graphics);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      direction = "SE";
    }
  }

}