package dev.mcdonaldkiosk.page.menu.order;

import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;
import dev.mcdonaldkiosk.util.KioskAudioPlayer;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class OrderDataConfirmPanel extends JPanel {

  private final JLabel ORDER_TEXT_LABEL = new JLabel();
  private final JLabel ORDER_DATA_LABEL = new JLabel();
  private final JButton CANCLE_BTN = new JButton();
  private final JButton PAYMENT_BTN = new JButton();

  private final Color BG_COLOR = Color.WHITE;
  private final Color CANCLE_BTN_COLOR = Color.GRAY;
  private final Color PAYMENT_BTN_COLR = Color.ORANGE;

  private MenuPage menuPage;
  private final KioskOrderData kioskOrderData;

  OrderDataConfirmPanel(MenuPage menuPage, KioskOrderData kioskOrderData) {
    this.menuPage = menuPage;
    this.kioskOrderData = kioskOrderData;

    initOrderConfirmPanel();

    initTextLabel();
    initDataLabel();
    initButton();

    setListener();
  }

  private void initOrderConfirmPanel() {
    this.setLayout(new GridLayout(0, 4));
    this.setBackground(BG_COLOR);
    this.add(ORDER_TEXT_LABEL);
    this.add(ORDER_DATA_LABEL);
    this.add(CANCLE_BTN);
    this.add(PAYMENT_BTN);
  }

  private void initTextLabel() {
    ORDER_TEXT_LABEL.setText(LangCheck.isTagalog()
        ? "<html>Dami ng order<br>Halaga ng order<br>Kabuuang Kalorya</html>"
        : "<html>Order quantity<br>Order amount<br>Total calories</html>");
    ORDER_TEXT_LABEL.setHorizontalAlignment(JLabel.CENTER);
  }

  private void initDataLabel() {
    ORDER_DATA_LABEL.setText("<html>" + kioskOrderData.getOrderQuantity() +
        "<br>" + kioskOrderData.getOrderAmount() +
        "<br>" + kioskOrderData.getOrderKCal() + "</html>");
    ORDER_DATA_LABEL.setHorizontalAlignment(JLabel.CENTER);
  }

  private void initButton() {
    CANCLE_BTN.setText(LangCheck.isTagalog() ? "KANSELAHIN ANG ORDER" : "CANCEL ORDER");
    CANCLE_BTN.setBackground(CANCLE_BTN_COLOR);

    PAYMENT_BTN.setText(LangCheck.isTagalog() ? "KUMPLETUHIN ANG ORDER" : "COMPLETE ORDER");
    PAYMENT_BTN.setBackground(PAYMENT_BTN_COLR);
  }

  private void setListener() {
    CANCLE_BTN.addActionListener((e) -> {
      kioskOrderData.clearMenu();
      menuPage.reflesh();
    });

    PAYMENT_BTN.addActionListener((e) -> {
      if (kioskOrderData.getOrderQuantity() == 0) {
        KioskAudioPlayer.newInstance(
            LangCheck.isTagalog() ? "sound/order_tag.wav" : "sound/order_eng.wav").play();
      } else {
        menuPage.nextPage();
      }
    });
  }

  void refresh() {
    ORDER_DATA_LABEL.setText("<html>" + kioskOrderData.getOrderQuantity() +
        "<br>" + kioskOrderData.getOrderAmount() +
        "<br>" + kioskOrderData.getOrderKCal() + "</html>");
  }
}
