package dev.mcdonaldkiosk.page.menu.table;

import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;


public class DessertTable extends MenuTable {

  public DessertTable(MenuPage menuPage, final KioskOrderData kioskOrderData, final int rows,
      final int cols) {
    super(menuPage, rows, cols);
    resisterDessert(kioskOrderData);
  }

  private void resisterDessert(final KioskOrderData kioskOrderData) {
    this.addMenu(
        createMenuButton("image/dessert/prol_201703290608504310.png",
            createMenu(LangCheck.isTagalog() ? "Reese’s McFlurry®" : "Reese’s McFlurry®", 2800, 300)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201601311029185960.png",
            createMenu(LangCheck.isTagalog() ? "Churros" : "Churros", 2000, 181)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201312050311223540.png",
            createMenu(LangCheck.isTagalog() ? "오Oreo McFlurry®" : "Oreo McFlurry®", 3000, 322)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201312041015558530.png",
            createMenu(LangCheck.isTagalog() ? "Strawberry Oreo McFlurry®" : "Strawberry Oreo McFlurry®", 3000,
                291)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201312050311494320.png",
            createMenu(LangCheck.isTagalog() ? "Choco Oreo McFlurry®" : "Choco Oreo McFlurry®", 3000, 375)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201311280226114370.png",
            createMenu(LangCheck.isTagalog() ? "Chocolate Sundae" : "Chocolate Sundae", 2000, 307)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201509091159582930.png",
            createMenu(LangCheck.isTagalog() ? "Caramel Sundae" : "Caramel Sundae", 2000, 306)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201311280223173290.png",
            createMenu(LangCheck.isTagalog() ? "Strawberry Sundae" : "Strawberry Sundae", 2000, 261)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201311280221377300.png",
            createMenu(LangCheck.isTagalog() ? "Oreo Affogato" : "Oreo Affogato", 2800, 248)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201311280227345110.png",
            createMenu(LangCheck.isTagalog() ? "Chocolate Cone" : "Chocolate Cone", 800, 229)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/dessert/prol_201311280228539530.png",
            createMenu(LangCheck.isTagalog() ? "Ice Cream Cone" : "Ice Cream Cone", 600, 153)
            , kioskOrderData));
  }

  @Override
  public String toString() {
    return LangCheck.isTagalog() ? "Desserts" : "Desserts";
  }
}
