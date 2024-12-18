package dev.mcdonaldkiosk.page.confirm;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.Menu;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;

class OrderTotalDataPanel extends JPanel {

  private final KioskOrderData kioskOrderData;

  OrderTotalDataPanel(KioskOrderData kioskOrderData) {
    this.kioskOrderData = kioskOrderData;

    initPanel();
  }


  private void initPanel() {
    this.setLayout(new BorderLayout());
    this.add(new JScrollPane(new JList<Menu>(kioskOrderData.getOrderMenuArray())),
        BorderLayout.CENTER);
    this.add(createTotalListPanel(), BorderLayout.SOUTH);
  }


  private JPanel createTotalListPanel() {
    JPanel totalListPanel = new JPanel();
    totalListPanel.setLayout(new GridLayout(0, 4));
    totalListPanel.add(new JLabel((LangCheck.isTagalog() ? "Lugar ng Pagkakainan : " : "Eating place : ") + kioskOrderData.getEatPlace(), JLabel.CENTER));
    totalListPanel.add(new JLabel((LangCheck.isTagalog() ? "Bilang ng Order : " : "Order quantity : ") + kioskOrderData.getOrderQuantity(), JLabel.CENTER));
    totalListPanel.add(new JLabel((LangCheck.isTagalog() ? "Halag ng Order : " : "Order amount : ") + kioskOrderData.getOrderAmount(), JLabel.CENTER));
    totalListPanel.add(new JLabel((LangCheck.isTagalog() ? "Pangkalahatang kalorya : " : "Total calories : ") + kioskOrderData.getOrderKCal(), JLabel.CENTER));

    return totalListPanel;
  }
}
