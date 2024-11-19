package dev.mcdonaldkiosk.page.menu.table;

import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.MenuPage;
import dev.mcdonaldkiosk.page.menu.order.KioskOrderData;

public class McCafeTable extends MenuTable {

  public McCafeTable(MenuPage menuPage, final KioskOrderData kioskOrderData, final int rows, final int cols) {
    super(menuPage, rows, cols);
    resisterMcCafe(kioskOrderData);
  }

  private void resisterMcCafe(final KioskOrderData kioskOrderData) {
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280310302830.png",
            createMenu(LangCheck.isTagalog() ? "Premium Roast™ Coffee" : "Premium Roast™ Coffee", 1500, 10)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280331001790.png",
            createMenu(LangCheck.isTagalog() ? "Iced Coffee" : "Iced Coffee", 1500, 10)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280338541970.png",
            createMenu(LangCheck.isTagalog() ? "Americano" : "Americano", 2000, 13)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280353272690.png",
            createMenu(LangCheck.isTagalog() ? "Café Latte" : "Café Latte", 2400, 157)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510160558512030.png",
            createMenu(LangCheck.isTagalog() ? "Caramel Macchiato" : "Caramel Macchiato", 2900, 217)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280345458940.png",
            createMenu(LangCheck.isTagalog() ? "Cappuccino" : "Cappuccino", 2400, 133)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501290511504900.png",
            createMenu(LangCheck.isTagalog() ? "Espresso" : "Espresso", 1500, 6)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201502020631462070.png",
            createMenu(LangCheck.isTagalog() ? "Iced Americano" : "Iced Americano", 2500, 11)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280314115040.png",
            createMenu(LangCheck.isTagalog() ? "Iced Café Latte" : "Iced Café Latte", 2900, 103)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510160619136820.png",
            createMenu(LangCheck.isTagalog() ? "Iced Caramel Macchiato" : "Iced Caramel Macchiato", 2900, 187)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201704210613038480.png",
            createMenu(LangCheck.isTagalog() ? "Apple Mango Yogurt Smoothie" : "Apple Mango Yogurt Smoothie", 3800,
                264)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201704210622303450.png",
            createMenu(
                LangCheck.isTagalog() ? "Strawberry Banana Yogurt Smoothie" : "Strawberry Banana Yogurt Smoothie", 3800,
                229)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201704210629445890.png", createMenu(
            LangCheck.isTagalog() ? "Blueberry Pomegranate Yogurt Smoothie" : "Blueberry Pomegranate Yogurt Smoothie",
            3800, 222)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201704210506373340.png",
            createMenu(LangCheck.isTagalog() ? "Strawberry Lemonade" : "Strawberry Lemonade", 1500, 197)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201610261154116690.png",
            createMenu(LangCheck.isTagalog() ? "Mocha Frappe" : "Mocha Frappe", 3800, 346)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312090423396200.png",
            createMenu(LangCheck.isTagalog() ? "Americano" : "Americano", 2400, 5)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100147004590.png",
            createMenu(LangCheck.isTagalog() ? "Cappuccino" : "Cappuccino", 3300, 110)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100203305430.png",
            createMenu(LangCheck.isTagalog() ? "Flat White" : "Flat White", 3300, 142)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170459513500.png",
            createMenu(LangCheck.isTagalog() ? "Café Mocha" : "Café Mocha", 3300, 146)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312091105256050.png",
            createMenu(LangCheck.isTagalog() ? "Espresso" : "Espresso", 2000, 3)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312091105541820.png",
            createMenu(LangCheck.isTagalog() ? "Espresso Macchiato" : "Espresso Macchiato", 2300, 6)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170531596900.png",
            createMenu(LangCheck.isTagalog() ? "Piccolo" : "Piccolo", 2800, 76)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510160644549250.png",
            createMenu(LangCheck.isTagalog() ? "초콜렛 아포가토" : "Chocolate Affogato", 3300, 250)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170559363440.png",
            createMenu(LangCheck.isTagalog() ? "아포가토" : "Affogato", 2800, 157)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100227331810.png",
            createMenu(LangCheck.isTagalog() ? "Café Latte" : "Café Latte", 3300, 135)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170502066960.png",
            createMenu(LangCheck.isTagalog() ? "Caramel Latte" : "Caramel Latte", 3800, 200)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510160657022070.png",
            createMenu(LangCheck.isTagalog() ? "Hazelnut Latte" : "Hazelnut Latte", 3800, 198)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100251215360.png",
            createMenu(LangCheck.isTagalog() ? "Vanilla Latte" : "Vanilla Latte", 3800, 203)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100734101020.png",
            createMenu(LangCheck.isTagalog() ? "Hot Chocolate" : "Hot Chocolate", 3300, 186)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170401131370.png",
            createMenu(LangCheck.isTagalog() ? "Premium Tea" : "Premium Tea", 2500, 0)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312091104271210.png",
            createMenu(LangCheck.isTagalog() ? "Babycino" : "Babycino", 500, 40)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100847100620.png",
            createMenu(LangCheck.isTagalog() ? "Iced Americano" : "Iced Americano", 2400, 5)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100851144040.png",
            createMenu(LangCheck.isTagalog() ? "Iced Chocolate" : "Iced Chocolate", 3800, 327)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100856188810.png",
            createMenu(LangCheck.isTagalog() ? "Iced Cafe Mocha" : "Iced Cafe Mocha", 3800, 167)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100908407470.png",
            createMenu(LangCheck.isTagalog() ? "Peach Ice Tea" : "Peach Ice Tea", 3900, 155)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100918340880.png",
            createMenu(LangCheck.isTagalog() ? "Raspberry Ice Tea" : "Raspberry Ice Tea", 3900, 155)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100929471100.png",
            createMenu(LangCheck.isTagalog() ? "Iced Cafe Latte" : "Iced Cafe Latte", 3700, 93)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170506071500.png",
            createMenu(LangCheck.isTagalog() ? "Iced Caramel Latte" : "Iced Caramel Latte", 4200, 158)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170503515230.png",
            createMenu(LangCheck.isTagalog() ? "Iced Hazelnut Latte" : "Iced Hazelnut Latte", 4200, 156)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170505356570.png",
            createMenu(LangCheck.isTagalog() ? "Iced Vanilla Latte" : "Iced Vanilla Latte", 4200, 161)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170507233320.png",
            createMenu(LangCheck.isTagalog() ? "Chocolate Frappe" : "Chocolate Frappe", 4500, 390)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510280616550500.png",
            createMenu(LangCheck.isTagalog() ? "Strawberry Frappe" : "Strawberry Frappe", 4500, 332)
            , kioskOrderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280222157270.png",
            createMenu(LangCheck.isTagalog() ? "Tomato Juice" : "Tomato Juice", 3500, 96)
            , kioskOrderData));
  }

  @Override
  public String toString() {
    return LangCheck.isTagalog() ? "McCafé®" : "McCafé®";
  }
}
