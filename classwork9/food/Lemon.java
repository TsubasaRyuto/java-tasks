package food;

public class Lemon {
  public String getName(String lang) {
    switch(lang) {
      case "ja":
        return "レモン";
      case "en":
        return "lemon";
      case "zh":
        return "柠檬";
      default:
        return "レモン";
    }
  }
}
