package dev.mcdonaldkiosk.page.payment.place;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.CommonGuidePanel;
import dev.mcdonaldkiosk.page.ImageTextButton;
import dev.mcdonaldkiosk.page.KioskPage;
import dev.mcdonaldkiosk.page.KioskPageType;
import dev.mcdonaldkiosk.page.PageData;
import dev.mcdonaldkiosk.util.Display;

public class PaymentPlacePage extends KioskPage {

  private final CommonGuidePanel PAYMENT_SELECT_PANEL = new CommonGuidePanel(
      LangCheck.isTagalog() ? "SAAN MO NAIS MAGBAYAD?" : "WHERE DO YOU WANT TO PAY?", 0, 2);

  private final ImageTextButton COUNTER_BTN = new ImageTextButton();
  private final ImageTextButton KIOSK_BTN = new ImageTextButton();

  private ActionListener placeListener = null;

  public PaymentPlacePage() {
    super(new PageData.Builder(LangCheck.isTagalog() ? "sound/pay_tag.wav" : "sound/pay_eng.wav")
                      .nextPageType(KioskPageType.MENU_PAGE)
                      .previousPageType(KioskPageType.EAT_PLACE_PAGE)
                      .build());

    initPage();
    initPaymentSelectPanel();
    initListeners();
    setListeners();
  }

  private void initPage() {
    this.setBackgroundImg("image/bg_green.jpg");
    this.showBackBtn();
  }

  private void initPaymentSelectPanel() {
    initKioskButton();
    PAYMENT_SELECT_PANEL.addItem(COUNTER_BTN, KIOSK_BTN);

    this.add(PAYMENT_SELECT_PANEL);
  }

  private void initKioskButton() {
    final int BUTTON_WIDTH = Display.WINDOWS_HALF_WIDTH * 4 / 15;
    final int BUTTON_HEIGHT = Display.WINDOWS_AVALIABLE_HEIGHT * 1 / 5;

    COUNTER_BTN.setText(LangCheck.isTagalog() ? "PAGBABAYAD SA COUNTER" : "PAYMENT AT THE COUNTER");
    COUNTER_BTN.setResizedImg(new ImageIcon("image/counter.jpg"), BUTTON_WIDTH, BUTTON_HEIGHT);

    KIOSK_BTN.setText(
        "<html><center>" + (LangCheck.isTagalog() ? "DIREKTANG PAGBAYAD SA KIOSK <br>(CARD)"
            : "DIRECT PAYMENT IN KIOSK<br>(CARD)")
            + "</center></html>");
    KIOSK_BTN.setResizedImg(new ImageIcon("image/kiosk.jpg"), BUTTON_WIDTH, BUTTON_HEIGHT);
  }

  private void initListeners() {
    this.placeListener = (eventSource) -> {
      Object source = eventSource.getSource();

      if (source.equals(COUNTER_BTN)) {
        KioskPage.getKioskOrderData().setPaymentPlace(PaymentPlace.COUNTER);
      } else if (source.equals(KIOSK_BTN)) {
        KioskPage.getKioskOrderData().setPaymentPlace(PaymentPlace.KIOSK);
      }

      this.loadNextPage();
    };
  }

  private void setListeners() {
    COUNTER_BTN.addActionListener(placeListener);

    KIOSK_BTN.addActionListener(placeListener);
  }
}
