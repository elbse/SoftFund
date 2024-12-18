package dev.mcdonaldkiosk.page.menu.table;

import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;


public class DrinkTable extends MenuTable {

  public DrinkTable(MenuPage menuPage, final KioskOrderData kioskOrderData, final int rows, final int cols) {
    super(menuPage, rows, cols);
    resisterDrink(kioskOrderData);
  }

  private void resisterDrink(final KioskOrderData kioskOrderData) {
    this.addMenu(
        createMenuButton("image/drink/prol_201312050151291100.png",
            createMenu(LangCheck.isTagalog() ? "Coca-Cola Zero\"" : "Coca-Cola Zero", 50, 0)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/drink/prol_201312050152466340.png",
            createMenu(LangCheck.isTagalog() ? "Coca-Cola" : "Coca-Cola", 45, 143)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/drink/prol_201312050152466340.png",
            createMenu(LangCheck.isTagalog() ? "Sprite" : "Sprite", 45, 149)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/drink/prol_201312050152466340.png",
            createMenu(LangCheck.isTagalog() ? "Fanta" : "Fanta", 45, 167)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/drink/prol_201402220224483140.png",
            createMenu(LangCheck.isTagalog() ? "Vanilla Shake" : "Vanilla Shake", 75, 339)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/drink/prol_201402220229522730.png",
            createMenu(LangCheck.isTagalog() ? "Strawberry Shake" : "Strawberry Shake", 85, 345)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/drink/prol_201402220234029140.png",
            createMenu(LangCheck.isTagalog() ? "Chocolate Shake" : "Chocolate Shake", 85, 339)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/drink/prol_201312090535528510.png",
            createMenu(LangCheck.isTagalog() ? "Orange Juice" : "Orange Juice", 25, 0)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/drink/prol_201312011125364160.png",
            createMenu(LangCheck.isTagalog() ? "Milk" : "Milk", 25, 0)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/drink/prol_201404220647354250.png",
            createMenu(LangCheck.isTagalog() ? "Mineral Water" : "Mineral Water", 15, 0)
            , kioskOrderData));
  }

  @Override
  public String toString() {
    return LangCheck.isTagalog() ? "Beverages" : "Beverages";
  }
}
