package dev.mcdonaldkiosk.page;

import java.awt.Color;
import javax.swing.JButton;
import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.util.Display;


public class BackButton extends JButton {


  private static final int WIDTH = Display.WINDOWS_HALF_WIDTH / 5;
  private static final int HEIGHT = Display.WINDOWS_AVALIABLE_HEIGHT / 20;
  private static final Color BG_COLOR = Color.LIGHT_GRAY;

  BackButton() {
    init();
    setLocationByTopRight();
  }

  private void init() {
    this.setText(LangCheck.isTagalog() ? "Bumalik" : "BACK");
    this.setSize(WIDTH, HEIGHT);
    this.setBackground(BG_COLOR);
  }
  
  private void setLocationByTopRight() {
    this.setLocation(Display.WINDOWS_HALF_WIDTH - WIDTH,
        Display.WINDOWS_AVALIABLE_HEIGHT - (Display.WINDOWS_AVALIABLE_HEIGHT - HEIGHT));
  }
}