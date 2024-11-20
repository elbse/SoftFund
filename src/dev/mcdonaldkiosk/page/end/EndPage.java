package dev.mcdonaldkiosk.page.end;

import java.awt.Color;
import javax.swing.ImageIcon;
import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.ImageTextPanel;
import dev.mcdonaldkiosk.page.KioskPage;
import dev.mcdonaldkiosk.page.KioskPageType;
import dev.mcdonaldkiosk.page.PageData;
import dev.mcdonaldkiosk.page.payment.place.PaymentPlace;
import dev.mcdonaldkiosk.util.Display;


public class EndPage extends KioskPage {

  public EndPage() {
    super(new PageData.Builder(KioskPage.getKioskOrderData().getPaymentPlace().equals(PaymentPlace.COUNTER)
                                ? LangCheck.isTagalog() ? "sound/counter_tag.wav" : "sound/counter_eng.wav"
                                : LangCheck.isTagalog() ? "sound/end_tag.wav" : "sound/end_eng.wav")
                      .nextPageType(KioskPageType.START_PAGE)
                      .build());

    emptyOrder();
    addImgTextPanel();
    setNextPage();
  }
  
  private void emptyOrder() {
    KioskPage.getKioskOrderData().emptyOrder();
  }
  
  private void addImgTextPanel() {
    this.add(createImgTextPanel());
  }
  
  private ImageTextPanel createImgTextPanel() {
    final ImageTextPanel imgTextPanel = new ImageTextPanel(new ImageIcon("image/bg_info3.jpg"),
        LangCheck.isTagalog() ? "KOMPLETO NA ANG IYONG ORDER" : "YOUR ORDER IS COMPLETE");
    imgTextPanel.setSize(Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT);
    imgTextPanel.setLocation(0, 0);
    imgTextPanel.setTextBackground(Color.BLUE);
    
    return imgTextPanel;
  }

  private void setNextPage() {
    this.setOnClickListener(() -> EndPage.this.loadNextPage());
  }
}
