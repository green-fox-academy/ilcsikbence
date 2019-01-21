import javax.swing.*;
import javax.xml.bind.Unmarshaller;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Board extends JComponent implements KeyListener, ActionListener {

  Timer timer = new Timer(60, this);
  DVDIcon dvdIcon;
  public static final int WINDOW_WIDTH = 720;
  public static final int WINDOW_HEIGHT = 576;

  public Board() {
    timer.start();
    dvdIcon = new DVDIcon("img/1.png", 80, 4);

    setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    setBounds(0, 0, 720, 576);
    setVisible(true);

  }

  public void actionPerformed(ActionEvent ev) {
    if (ev.getSource() == timer) {

    }
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

  }

}