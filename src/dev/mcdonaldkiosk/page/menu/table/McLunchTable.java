package dev.mcdonaldkiosk.page.menu.table;

import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;


public class McLunchTable extends MenuTable {

  public McLunchTable(MenuPage menuPage, final KioskOrderData kioskOrderData, final int rows,
      final int cols) {
    super(menuPage, rows, cols);
    resisterMcLunch(kioskOrderData);
  }

  private void resisterMcLunch(final KioskOrderData kioskOrderData) {
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201704280826064130.png",
            createMenu(
                LangCheck.isTagalog() ? "Crispy Oriental Chicken Burger Meal" : "Crispy Oriental Chicken Burger Meal",
                5500, 988)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201402210535304330.png",
            createMenu(LangCheck.isTagalog() ? "Big Mac®<br>Extra Value Meal" : "Big Mac®<br>Extra Value Meal", 400, 880)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021239480850.png",
            createMenu(LangCheck.isTagalog() ? "McSpicy™ Shanghai Burger<br>Extra Value Meal"
                : "McSpicy™ Shanghai Burger<br>Extra Value Meal", 400, 831)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201508070731369560.png",
            createMenu(LangCheck.isTagalog() ? "1955 Burger™<br>Extra Value Meal" : "1955 Burger™<br>Extra Value Meal",
                400, 877)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021239276890.png",
            createMenu(LangCheck.isTagalog() ? "Quarter Pounder® with Cheese<br>Extra Value Meal"
                : "Quarter Pounder® with Cheese<br>Extra Value Meal", 400, 864)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201612221010079000.png",
            createMenu(LangCheck.isTagalog() ? "Supreme Shrimp Burger Meal" : "Supreme Shrimp Burger Meal", 400, 772)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201612221010197520.png",
            createMenu(LangCheck.isTagalog() ? "Shrimp Beef Burger Meal" : "Shrimp Beef Burger Meal", 600, 893)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021239122200.png",
            createMenu(LangCheck.isTagalog() ? "Bacon Tomato Deluxe™<br>Extra Value Meal"
                : "Bacon Tomato Deluxe™<br>Extra Value Meal", 300, 887)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021240387800.png",
            createMenu(LangCheck.isTagalog() ? "Bulgogi Burger<br>Extra Value Meal" : "Bulgogi Burger<br>Extra Value Meal",
                500, 767)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021240536440.png",
            createMenu(
                LangCheck.isTagalog() ? "Double Bulgogi Burger<br>Extra Value Meal" : "Double Bulgogi Burger<br>Extra Value Meal",
                500, 1014)
            , kioskOrderData));
  }

  @Override
  public String toString() {
    return LangCheck.isTagalog() ? "McLunch™" : "McLunch™";
  }
}
