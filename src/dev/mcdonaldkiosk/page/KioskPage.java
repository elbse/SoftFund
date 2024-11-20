package dev.mcdonaldkiosk.page;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import dev.mcdonaldkiosk.main.MainFrame;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;
import dev.mcdonaldkiosk.util.Display;
import dev.mcdonaldkiosk.util.KioskAudioPlayer;

public abstract class KioskPage extends JPanel {

  protected interface OnClickListener {
    void onClick();
  }

  private OnClickListener onClickListener = null;

  private static final KioskOrderData kioskOrderData = new KioskOrderData();
  private PageData pageData;

  private MainFrame mainFrame;
  private final BackButton backBtn = new BackButton();
  private String bgPath;
  private BufferedImage bufferImg; // Field to store the pre-loaded background image

  KioskPage() {}

  public KioskPage(PageData pageData) {
    this.pageData = pageData;

    initKioskPage();
    playKioskVoice(pageData.getAudioPath());
    setBackBtnListener();
    setMouseListener();
  }

  private void initKioskPage() {
    this.setLayout(null);
    this.setSize(Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT);
    this.setLocation(0, 0);
  }

  private void playKioskVoice(final String audioPath) {
    KioskAudioPlayer.newInstance(audioPath).play();
  }

  private void setBackBtnListener() {
    backBtn.addActionListener(e -> loadPreviousPage());
  }

  protected void setOnClickListener(final OnClickListener listener) {
    onClickListener = listener;
  }

  private void setMouseListener() {
    this.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (onClickListener != null) {
          onClickListener.onClick();
        }
      }
    });
  }

  public void setMainFrame(MainFrame mainFrame) {
    this.mainFrame = mainFrame;
  }

  protected BackButton getBackButton() {
    return backBtn;
  }

  // Responsible for setting and pre-loading background images
  protected void setBackgroundImg(final String bgPath) {
    if (bgPath != null) {
      this.bgPath = bgPath;
      try {
        File bgFile = new File(bgPath);
        if (bgFile.exists()) {
          bufferImg = ImageIO.read(bgFile);
          if (bufferImg == null) {
            throw new IOException("Unsupported image format: " + bgPath);
          }
        } else {
          System.err.println("File not found: " + bgPath);
          bufferImg = null;
        }
      } catch (IOException e) {
        System.err.println("Error loading background image: " + bgPath);
        e.printStackTrace();
        bufferImg = null; // Ensure fallback is handled gracefully
      }
    }
  }


  protected void showBackBtn() {
    setBackBtnZOrderByTop();
    this.add(backBtn);
  }

  private void setBackBtnZOrderByTop() {
    this.setComponentZOrder(backBtn, 0);
  }

  private boolean isBgImgEmpty() {
    return bufferImg != null;
  }

  @Override
  protected void paintComponent(final Graphics g) {
    super.paintComponent(g); // Always call the super method first

    if (isBgImgEmpty()) {
      // Draw the pre-loaded background image
      g.drawImage(bufferImg, 0, 0, Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT, null);
    } else {
      // Draw a placeholder if no valid image is loaded
      g.setColor(Color.GRAY);
      g.fillRect(0, 0, Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT);
      g.setColor(Color.BLACK);
      g.drawString("Image could not be loaded", 20, 20);
    }
  }

  protected void loadNextPage() {
    KioskPageType pageType = pageData.getNextPageType();
    if (pageType != KioskPageType.EMPTY_PAGE) {
      mainFrame.attachPage(pageType.createKioskPage());
    }
  }

  protected void loadPreviousPage() {
    KioskPageType pageType = pageData.getPreviousPageType();
    if (pageType != KioskPageType.EMPTY_PAGE) {
      mainFrame.attachPage(pageType.createKioskPage());
    }
  }

  protected void reloadPage() {
    try {
      mainFrame.attachPage(this.getClass().newInstance());
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  protected static KioskOrderData getKioskOrderData() {
    return kioskOrderData;
  }
}
