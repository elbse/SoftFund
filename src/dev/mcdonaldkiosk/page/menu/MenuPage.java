package dev.mcdonaldkiosk.page.menu;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.KioskPage;
import dev.mcdonaldkiosk.page.KioskPageType;
import dev.mcdonaldkiosk.page.PageData;
import dev.mcdonaldkiosk.page.menu.order.SelectedOrderConfirmPanel;
import dev.mcdonaldkiosk.util.Display;
import dev.mcdonaldkiosk.util.ImageEdit;

public class MenuPage extends KioskPage {

  private final JPanel menuPagePanel = new JPanel();

  private final ImageIcon bannerImageIcon = new ImageIcon("image/banner_top.jpg");
  private final MenuTabbedPane menuTabbedPane;
  private final SelectedOrderConfirmPanel selectedOrderConfirmPanel;

  public MenuPage() {
    super(new PageData.Builder(LangCheck.isTagalog() ? "sound/order_tag.wav" : "sound/order_eng.wav")
                      .nextPageType(KioskPageType.CONFIRM_PAGE)
                      .previousPageType(KioskPageType.PAYMENT_PLACE_PAGE)
                      .build());

    menuTabbedPane = new MenuTabbedPane(this, KioskPage.getKioskOrderData());
    selectedOrderConfirmPanel = new SelectedOrderConfirmPanel(this, KioskPage.getKioskOrderData());

    initPage();
    initManuPagePanel();
    setLayout();
    reflesh();
  }

  private void initPage() {
    this.showBackBtn();
    this.add(menuPagePanel);
  }

  private void initManuPagePanel() {
    menuPagePanel.setLayout(new BorderLayout());
    menuPagePanel.setSize(Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT);
    menuPagePanel.setLocation(0, 0);

    menuPagePanel.add(createImageLabel(bannerImageIcon), BorderLayout.NORTH);
    menuPagePanel.add(menuTabbedPane, BorderLayout.CENTER);
    menuPagePanel.add(selectedOrderConfirmPanel, BorderLayout.SOUTH);

  }

  private JLabel createImageLabel(final ImageIcon imageIcon) {
    return new JLabel(
        ImageEdit.getResizeIcon(imageIcon, Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT
            / 5));
  }

  private void setLayout() {
    this.getBackButton().addActionListener((e) -> KioskPage.getKioskOrderData().clearMenu());
  }

  public void reflesh() {
    selectedOrderConfirmPanel.reflesh();
  }

  public void nextPage() {
    this.loadNextPage();
  }
}
