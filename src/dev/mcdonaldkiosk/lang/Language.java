package dev.mcdonaldkiosk.lang;

public enum Language {
  TAGALOG, ENGLISH;

  @Override
  public String toString() {
    return this.name();
  }
}
