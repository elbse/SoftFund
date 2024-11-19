package dev.mcdonaldkiosk.page.menu.table;

import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;

public class SnackTable extends MenuTable {

  public SnackTable(MenuPage menuPage, final KioskOrderData kioskOrderData, final int rows, final int cols) {
    super(menuPage, rows, cols);
    resisterSnack(kioskOrderData);
  }

  private void resisterSnack(final KioskOrderData kioskOrderData) {
    this.addMenu(
        createMenuButton("image/snack/prol_201312040705101540.png",
            createMenu(LangCheck.isTagalog() ? "McNuggets® 4pc" : "McNuggets® 4pc", 250, 185)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041109175130.png",
            createMenu(LangCheck.isTagalog() ? "McNuggets® 6pc" : "McNuggets® 6pc", 300, 378)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041117509620.png",
            createMenu(LangCheck.isTagalog() ? "McNuggets® 10pc" : "McNuggets® 10pc", 350, 463)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041119014910.png",
            createMenu(LangCheck.isTagalog() ? "McNuggets® 20pc" : "McNuggets® 20pc", 200, 925)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041112149570.png",
            createMenu(LangCheck.isTagalog() ? "McSpicy™ Chicken Tenders 2pc" : "McSpicy™ Chicken Tenders 2pc",
                400, 180)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041113153590.png",
            createMenu(LangCheck.isTagalog() ? "McSpicy™ Chicken Tenders 4pc" : "McSpicy™ Chicken Tenders 4pc",
                500, 359)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312051035534240.png",
            createMenu(LangCheck.isTagalog() ? "McSpicy™ Chicken Tenders 8pc" : "McSpicy™ Chicken Tenders 8pc",
                600, 719)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201404300757383040.png",
            createMenu(LangCheck.isTagalog() ? "McWings™ 2pc" : "McWings™ 2pc", 270, 236)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201404300800189010.png",
            createMenu(LangCheck.isTagalog() ? "McWings™ 4pc" : "McWings™ 4pc", 470, 472)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201404300802241440.png",
            createMenu(LangCheck.isTagalog() ? "McWings™ 8pc" : "McWings™ 8pc", 500, 945)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201402220248443700.png",
            createMenu(LangCheck.isTagalog() ? "Double Chicken Box" : "Double Chicken Box", 170, 1644)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201405120556246810.png",
            createMenu(LangCheck.isTagalog() ? "Chicken Snack Pack" : "Chicken Snack Pack", 85, 935)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201704250505221790.png",
            createMenu(LangCheck.isTagalog() ? "Jeju Tangerine Salad" : "Jeju Tangerine Salad", 35, 18)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201703240201573360.png",
            createMenu(LangCheck.isTagalog() ? "Waffle Fries" : "Waffle Fries", 20, 197)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201504290918266140.png",
            createMenu(LangCheck.isTagalog() ? "French Fries" : "French Fries", 20, 368)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312111049449760.png",
            createMenu(LangCheck.isTagalog() ? "McSpicy™ Chicken Snack Wrap®" : "McSpicy™ Chicken Snack Wrap®",
                25, 296)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201401090204552140.png",
            createMenu(LangCheck.isTagalog() ? "Spicy Beef Snack Wrap®" : "Spicy Beef Snack Wrap®", 25, 297)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312130709085280.png",
            createMenu(LangCheck.isTagalog() ? "Pineapple Fruit Cup" : "Pineapple Fruit Cup", 25, 0)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201311280851341080.png",
            createMenu(LangCheck.isTagalog() ? "Hash Brown" : "Hash Brown", 30, 156)
            , kioskOrderData));
  }

  @Override
  public String toString() {
    return LangCheck.isTagalog() ? "Snacks & Sides" : "Snacks & Sides";
  }
}
