package dev.mcdonaldkiosk.page.menu.order;

import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JScrollPane;
import dev.mcdonaldkiosk.lang.LangCheck;
import dev.mcdonaldkiosk.page.menu.Menu;


class OrderListPanel extends JScrollPane {

  public final JList<Menu> J_LIST = new JList<>();

  public OrderListPanel() {
    initScrollPane();
  }

  private void initScrollPane() {
    this.setViewportView(J_LIST);
    this.setBorder(
        BorderFactory.createTitledBorder(LangCheck.isTagalog() ? "선택메뉴" : "Select Menu")); // 경계설정
    this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // 가로바
  }

  void setJListMenu(Menu[] menuArray) {
    J_LIST.setListData(menuArray);
    scrollDown();
  }


  private void scrollDown() {
    getVerticalScrollBar().setValue(getVerticalScrollBar().getMaximum());
  }
}
