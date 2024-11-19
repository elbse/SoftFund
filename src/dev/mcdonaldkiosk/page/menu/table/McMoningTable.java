package dev.mcdonaldkiosk.page.menu.table;

import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;


public class McMoningTable extends MenuTable {

  public McMoningTable(MenuPage menuPage, final KioskOrderData kioskOrderData, final int rows,
      final int cols) {
    super(menuPage, rows, cols);
    resisterMcMoning(kioskOrderData);
  }

  private void resisterMcMoning(final KioskOrderData kioskOrderData) {
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201703160247462420.png",
            createMenu(LangCheck.isTagalog() ? "Tomato Bacon Egg McMuffin™" : "Tomato Bacon Egg McMuffin™",
                320, 448)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201311280852253010.png",
            createMenu(LangCheck.isTagalog() ? "BLT Muffin" : "BLT Muffin", 250, 385)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201703160249302220.png",
            createMenu(LangCheck.isTagalog() ? "Tomato Chicken 'n Cheese Muffin" : "Tomato Chicken 'n Cheese Muffin",
                230, 510)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402210536286650.png",
            createMenu(LangCheck.isTagalog() ? "Egg McMuffin™" : "Egg McMuffin™", 120, 286)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201311280852044240.png",
            createMenu(LangCheck.isTagalog() ? "Bacon Egg McMuffin™" : "Bacon Egg McMuffin™", 160, 289)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201603170147008720.png",
            createMenu(LangCheck.isTagalog() ? "Sausage McMuffin™" : "Sausage McMuffin™", 175, 338)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402210548008880.png",
            createMenu(LangCheck.isTagalog() ? "Sausage Egg McMuffin™" : "Sausage Egg McMuffin™", 250, 414)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402210551034670.png",
            createMenu(LangCheck.isTagalog() ? "Chicken 'n Cheese Muffin" : "Chicken 'n Cheese Muffin", 235, 338)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201312111049449760.png",
            createMenu(LangCheck.isTagalog() ? "McSpicy™ Chicken Snack Wrap®" : "McSpicy™ Chicken Snack Wrap®",
                325, 296)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402240350481910.png",
            createMenu(LangCheck.isTagalog() ? "Deluxe Breakfast™" : "Deluxe Breakfast™", 265, 816)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402240351164550.png",
            createMenu(LangCheck.isTagalog() ? "Big Breakfast™" : "Big Breakfast™", 400, 596)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402210552030320.png",
            createMenu(LangCheck.isTagalog() ? "Hotcakes 3pc" : "Hotcakes 3pc", 200, 331)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201703160231285820.png",
            createMenu(LangCheck.isTagalog() ? "Tomato Bacon Egg McMuffin™<br>Extra Value Breakfast"
                : "Tomato Bacon Egg McMuffin™<br>Extra Value Breakfast", 400, 448)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280449072030.png",
            createMenu(
                LangCheck.isTagalog() ? "BLT Muffin<br>Extra Value Breakfast" : "BLT Muffin<br>Extra Value Breakfast",
                400, 385)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201703160238588990.png",
            createMenu(LangCheck.isTagalog() ? "Tomato Chicken 'n Cheese Muffin<br>Extra Value Breakfast"
                : "Tomato Chicken 'n Cheese Muffin<br>Extra Value Breakfast", 500, 510)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280441107300.png",
            createMenu(
                LangCheck.isTagalog() ? "Egg McMuffin™<br>Extra Value Breakfast" : "Egg McMuffin™<br>Extra Value Breakfast",
                300, 452)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280442076260.png",
            createMenu(LangCheck.isTagalog() ? "Bacon Egg McMuffin™<br>Extra Value Breakfast"
                : "Bacon Egg McMuffin™<br>Extra Value Breakfast", 300, 454)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280444463940.png",
            createMenu(
                LangCheck.isTagalog() ? "Sausage McMuffin™<br>Extra Value Breakfast" : "Sausage McMuffin™<br>Extra Value Breakfast",
                200, 504)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280443577710.png",
            createMenu(LangCheck.isTagalog() ? "Sausage Egg McMuffin™<br>Extra Value Breakfast"
                : "Sausage Egg McMuffin™<br>Extra Value Breakfast", 300, 579)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280445552890.png",
            createMenu(LangCheck.isTagalog() ? "Chicken 'n Cheese Muffin<br>Extra Value Breakfast"
                : "Chicken 'n Cheese Muffin<br>Extra Value Breakfast", 400, 503)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280446555460.png",
            createMenu(LangCheck.isTagalog() ? "Deluxe Breakfast™<br>Extra Value Breakfast"
                : "Deluxe Breakfast™<br>Extra Value Breakfast", 300, 826)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280447308350.png",
            createMenu(
                LangCheck.isTagalog() ? "Big Breakfast™<br>Extra Value Breakfast" : "Big Breakfast™<br>Extra Value Breakfast",
                500, 605)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280448120810.png",
            createMenu(
                LangCheck.isTagalog() ? "Hotcakes 3pc<br>Extra Value Breakfast" : "Hotcakes 3pc<br>Extra Value Breakfast", 300,
                340)
            , kioskOrderData));
  }

  @Override
  public String toString() {
    return LangCheck.isTagalog() ? "McMorning" : "McMorning";
  }
}
