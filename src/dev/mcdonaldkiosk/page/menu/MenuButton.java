package dev.mcdonaldkiosk.page.menu;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;
import dev.mcdonaldkiosk.util.Display;
import dev.mcdonaldkiosk.util.ImageEdit;
import dev.mcdonaldkiosk.util.KioskAudioPlayer;

public class MenuButton extends JButton {

  private final String PRICE_FONT_COLOR = "red";
  private final String IMG_PATH;
  private final Menu MENU;

  private final KioskAudioPlayer clickBGMPlayer = KioskAudioPlayer.newInstance("sound/beep.wav");

  private MenuPage menuPage;
  private final KioskOrderData kioskOrderData;

  public MenuButton(String imgPath, Menu menu, MenuPage menuPage, KioskOrderData kioskOrderData) {
    this.IMG_PATH = imgPath;
    this.MENU = menu;
    this.menuPage = menuPage;
    this.kioskOrderData = kioskOrderData;

    initMenuButton();
    setListener();
  }

  private void initMenuButton() {
    this.setIcon(
        ImageEdit.getResizeIcon(IMG_PATH, Display.WINDOWS_HALF_WIDTH / 5, Display.WINDOWS_AVALIABLE_HEIGHT
            / 10));
    this.setText(MENU.toMenuButtonText(PRICE_FONT_COLOR));
    this.setHorizontalTextPosition(SwingConstants.CENTER);
    this.setVerticalTextPosition(SwingConstants.BOTTOM);

    this.setBackground(Color.WHITE);
    this.setBorderPainted(false);
  }

  private void setListener() {
    this.addActionListener((e) -> {
      clickBGMPlayer.play();

      kioskOrderData.addMenu(MENU);
      menuPage.reflesh();
    });
  }
}
