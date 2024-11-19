package dev.mcdonaldkiosk.page.menu.order;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;


public class SelectedOrderConfirmPanel extends JPanel {


  private final TextToolbarPanel textToolbarPanel;
  private final OrderListPanel orderListPanel;
  private final OrderDataConfirmPanel orderDataConfirmPanel;

  private final KioskOrderData kioskOrderData;

  public SelectedOrderConfirmPanel(MenuPage menuPage, KioskOrderData kioskOrderData) {
    this.kioskOrderData = kioskOrderData;

    textToolbarPanel = new TextToolbarPanel();
    orderListPanel = new OrderListPanel();
    orderDataConfirmPanel = new OrderDataConfirmPanel(menuPage, kioskOrderData);


    initMyOrderPanel();
    addTextToTextToolbar();
  }

  private void initMyOrderPanel() {
    this.setLayout(new BorderLayout());
    this.add(textToolbarPanel.getPanel(), BorderLayout.NORTH);
    this.add(orderListPanel, BorderLayout.CENTER);
    this.add(orderDataConfirmPanel, BorderLayout.SOUTH);
  }

  
  private void addTextToTextToolbar() {
    textToolbarPanel.addText((LangCheck.isTagalog() ? "Lugar ng Pagkakainan : " : "Eating place : ") + kioskOrderData
        .getEatPlace())
        .addText((LangCheck.isTagalog() ? "Paraan sa Pagbayad : " : "Mode of Payment : ") + kioskOrderData.getPaymentPlace());
  }


  public void reflesh() {
    orderListPanel.setJListMenu(kioskOrderData.getOrderMenuArray());
    orderDataConfirmPanel.refresh();
  }
}
