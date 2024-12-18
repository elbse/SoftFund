package dev.mcdonaldkiosk.page.confirm;

import java.awt.Color;
import java.awt.Component;
import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.CommonGuidePanel;
import dev.mcdonaldkiosk.page.KioskPage;
import dev.mcdonaldkiosk.page.KioskPageType;
import dev.mcdonaldkiosk.page.PageData;
import dev.mcdonaldkiosk.page.payment.place.PaymentPlace;
import dev.mcdonaldkiosk.util.Display;


public class ConfirmPage extends KioskPage {

  private final CommonGuidePanel ORDER_CONFIRM_GUIDE_PANEL = new CommonGuidePanel(
      LangCheck.isTagalog() ? "Tama ba ang iyong order?" : "IS THIS ORDER CORRECT?", 0, 1);

  private OrderTotalDataPanel orderTotalDataPanel;


  private final CommonGuidePanel YES_NO_SELECT_PANEL = new CommonGuidePanel(0, 2);
  private final ConfirmButton NO_BUTTON = new ConfirmButton(LangCheck.isTagalog() ? "Hindi" : "NO");
  private final ConfirmButton YES_BUTTON = new ConfirmButton(LangCheck.isTagalog() ? "Oo" : "YES");

  public ConfirmPage() {
    super(new PageData.Builder(LangCheck.isTagalog() ? "sound/check.wav" : "sound/check_eng.wav")
                      .nextPageType(KioskPage.getKioskOrderData().getPaymentPlace().equals(PaymentPlace.COUNTER)
                                       ? KioskPageType.END_PAGE : KioskPageType.PAYMENT_CARD_PAGE)
                      .previousPageType(KioskPageType.MENU_PAGE)
                      .build());
    orderTotalDataPanel = new OrderTotalDataPanel(KioskPage.getKioskOrderData());

    initPage();
    initOrderTotalListPanel();
    initYesNoSelectPanel();
    setListener();
  }

  private void initPage() {
    this.setBackgroundImg("image/bg_green.png");

    this.add(ORDER_CONFIRM_GUIDE_PANEL);
    this.add(YES_NO_SELECT_PANEL);
  }

  private void initOrderTotalListPanel() {
    ORDER_CONFIRM_GUIDE_PANEL.setTitleColor(Color.GREEN);
    ORDER_CONFIRM_GUIDE_PANEL.addItem(orderTotalDataPanel);
  }

  private void initYesNoSelectPanel() {
    YES_NO_SELECT_PANEL.addItem(NO_BUTTON, YES_BUTTON);

    final int PANEL_WIDTH = Display.WINDOWS_HALF_WIDTH * 2 / 5;
    final int PANEL_HEIGHT = Display.WINDOWS_AVALIABLE_HEIGHT * 2 / 25;
    Component yesNoSelectComp = YES_NO_SELECT_PANEL;
    yesNoSelectComp.setSize(PANEL_WIDTH, PANEL_HEIGHT);
    yesNoSelectComp
        .setLocation((Display.WINDOWS_HALF_WIDTH - PANEL_WIDTH) / 2, Display.WINDOWS_AVALIABLE_HEIGHT
            * 3 / 4);
  }

  private void setListener() {
    this.NO_BUTTON.addActionListener((e) -> this.loadPreviousPage());

    this.YES_BUTTON.addActionListener((e) -> this.loadNextPage());
  }
}
