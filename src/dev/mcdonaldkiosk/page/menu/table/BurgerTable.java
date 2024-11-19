package dev.mcdonaldkiosk.page.menu.table;

import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;

public class BurgerTable extends MenuTable {

  public BurgerTable(MenuPage menuPage, final KioskOrderData kioskOrderData, final int rows, final int cols) {
    super(menuPage, rows, cols);
    resisterBurger(kioskOrderData);
  }

  private void resisterBurger(final KioskOrderData kioskOrderData) {
    this.addMenu(
        createMenuButton("image/burger/Golden Egg Cheeseburger.png",
            createMenu(LangCheck.isTagalog() ? "Golden Egg Cheeseburger" : "Golden Egg Cheeseburger", 400, 636),
            kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Grilled Mushroom Burger.png",
            createMenu(LangCheck.isTagalog() ? "Grilled Mushroom Burger" : "Grilled Mushroom Burger", 180, 679),
            kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Crispy Oriental Chicken Burger.png",
            createMenu(LangCheck.isTagalog() ? "Crispy Oriental Chicken Burger" : "Crispy Oriental Chicken Burger",
                265, 620), kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Big Mac®.png",
            createMenu(LangCheck.isTagalog() ? "BigMac®" : "BigMac®", 225, 512), kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Mega Mac.png",
            createMenu(LangCheck.isTagalog() ? "Mega Mac" : "Mega Mac", 250, 694), kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/McSpicy™ Shanghai Burger.png",
            createMenu(LangCheck.isTagalog() ? "McSpicy™ Shanghai Burger" : "McSpicy™ Shanghai Burger", 345,
                463)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/1955 Burger™.png",
            createMenu(LangCheck.isTagalog() ? "1955 Burger™" : "1955 Burger™", 135, 509)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Double 1955 Burger™.png",
            createMenu(LangCheck.isTagalog() ? "Double 1955 Burger™" : "Double 1955 Burger™", 270, 726)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Quarter Pounder® with Cheese.png",
            createMenu(LangCheck.isTagalog() ? "Quarter Pounder® with Cheese" : "Quarter Pounder® with Cheese", 200,
                496)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Double Quarter Pounder® with Cheese.png",
            createMenu(
                LangCheck.isTagalog() ? "Double Quarter Pounder® with Cheese" : "Double Quarter Pounder® with Cheese", 400,
                712)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Supreme Shrimp Burger.png",
            createMenu(LangCheck.isTagalog () ? "Supreme Shrimp Burger" : "Supreme Shrimp Burger", 230, 404)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Shrimp Beef Burger.png",
            createMenu(LangCheck.isTagalog() ? "Shrimp Beef Burger" : "Shrimp Beef Burger", 300, 525)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Bacon Tomato Deluxe™.png",
            createMenu(LangCheck.isTagalog() ? "Bacon Tomato Deluxe™": "Bacon Tomato Deluxe™", 180, 519)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Tomato Cheeseburger.png",
            createMenu(LangCheck.isTagalog() ? "Tomato Cheeseburger" : "Tomato Cheeseburger", 120, 335)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Bulgogi Burger.png",
            createMenu(LangCheck.isTagalog() ? "Bulgogi Burger" : "Bulgogi Burger", 280, 398)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Double Bulgogi Burger.png",
            createMenu(LangCheck.isTagalog() ? "Double Bulgogi Burger" : "Double Bulgogi Burger", 435, 646)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Chicken Burger.png",
            createMenu(LangCheck.isTagalog() ? "Chicken Burger" : "Chicken Burger", 120, 324)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Cheeseburger.png",
            createMenu(LangCheck.isTagalog() ? "Cheeseburger" : "Cheeseburger", 100, 302)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/burger/Hamburger.png",
            createMenu(LangCheck.isTagalog() ? "Hamburger" : "Hamburger", 105, 253)
            , kioskOrderData));
  }

  @Override
  public String toString() {
    return LangCheck.isTagalog() ? "Burgers & Sandwiches" : "Burgers & Sandwiches";
  }
}
