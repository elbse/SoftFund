package dev.mcdonaldkiosk.page.menu.table;

import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;

public class SetMenuTable extends MenuTable {

  public SetMenuTable(MenuPage menuPage, final KioskOrderData kioskOrderData, final int rows,
      final int cols) {
    super(menuPage, rows, cols);
    resisterSetMenu(kioskOrderData);
  }

  private void resisterSetMenu(final KioskOrderData kioskOrderData) {
    this.addMenu(
        createMenuButton("image/set_menu/prol_201703290425058560.png",
            createMenu(LangCheck.isTagalog() ? "Golden Egg Cheeseburger Meal" : "Golden Egg Cheeseburger Meal",
                9700, 1004)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201703290425447840.png",
            createMenu(LangCheck.isTagalog() ? "Grilled Mushroom Burger Meal" : "Grilled Mushroom Burger Meal",
                9700, 1047)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201704280826064130.png",
            createMenu(
                LangCheck.isTagalog() ? "Crispy Oriental Chicken Burger Meal" : "Crispy Oriental Chicken Burger Meal",
                7100, 988)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201402210535304330.png",
            createMenu(LangCheck.isTagalog() ? "Big Mac® Extra<br>Value Meal" : "Big Mac® Extra<br>Value Meal", 6300, 880)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201605160956103670.png",
            createMenu(LangCheck.isTagalog() ? "Mega Mac Extra Value Meal" : "Mega Mac Extra Value Meal", 7600, 1062)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021239480850.png",
            createMenu(LangCheck.isTagalog() ? "McSpicy™ Shanghai Burger<br>Extra Value Meal"
                : "McSpicy™ Shanghai Burger<br>Extra Value Meal", 6300, 831)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201508070731369560.png",
            createMenu(LangCheck.isTagalog() ? "1955 Burger™<br>Extra Value Meal" : "1955 Burger™<br>Extra Value Meal",
                7500, 877)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201403131156168140.png",
            createMenu(
                LangCheck.isTagalog() ? "Double 1955 Burger™<br>Extra Value Meal" : "Double 1955 Burger™<br>Extra Value Meal",
                8800, 1094)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021239276890.png",
            createMenu(LangCheck.isTagalog() ? "Quarter Pounder® with Cheese<br>Extra Value Meal"
                : "Quarter Pounder® with Cheese<br>Extra Value Meal", 7100, 864)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312011049256070.png",
            createMenu(LangCheck.isTagalog() ? "Double Quarter Pounder®<br>with CheeseExtra Value Meal"
                : "Double Quarter Pounder®<br>with CheeseExtra Value Meal", 8300, 1080)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201612221010079000.png",
            createMenu(LangCheck.isTagalog() ? "Supreme Shrimp Burger Meal" : "Supreme Shrimp Burger Meal", 6300, 772)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201612221010197520.png",
            createMenu(LangCheck.isTagalog() ? "Shrimp Beef Burger Meal" : "Shrimp Beef Burger Meal", 7500, 893)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021239122200.png",
            createMenu(LangCheck.isTagalog() ? "Bacon Tomato Deluxe™<br>Extra Value Meal"
                : "Bacon Tomato Deluxe™<br>Extra Value Meal", 7400, 887)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021240387800.png",
            createMenu(LangCheck.isTagalog() ? "Bulgogi Burger<br>Extra Value Meal" : "Bulgogi Burger<br>Extra Value Meal",
                5300, 767)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021240536440.png",
            createMenu(
                LangCheck.isTagalog() ? "Double Bulgogi Burger<br>Extra Value Meal" : "Double Bulgogi Burger<br>Extra Value Meal",
                6300, 1014)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201404300804125040.png",
            createMenu(LangCheck.isTagalog() ? "McWings™<br>Extra Value Meal" : "McWings™<br>Extra Value Meal", 6000, 841)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312011051114730.png",
            createMenu(LangCheck.isTagalog() ? "McSpicy™ Chicken Tenders<br>Extra Value Meal"
                : "McSpicy™ Chicken Tenders<br>Extra Value Meal", 6400, 728)
            , kioskOrderData));
  }

  @Override
  public String toString() {
    return LangCheck.isTagalog() ? "Extra Value Meals" : "Extra Value Meals";
  }
}
