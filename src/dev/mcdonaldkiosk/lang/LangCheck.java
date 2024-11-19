package dev.mcdonaldkiosk.lang;

public class LangCheck {

  private static Language language = Language.TAGALOG;

  private LangCheck() {
  }

  public static void setLang(Language language) {
    LangCheck.language = language;
  }

  public static boolean isTagalog() {
    return language == Language.TAGALOG;
  }
}
