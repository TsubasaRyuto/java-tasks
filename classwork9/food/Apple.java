package food;

public class Apple {
  public String getName(String lang) {
    switch(lang) {
      case "ja":
        return "りんご";
      case "en":
        return "apple";
      case "zh":
        return "苹果";
      default:
        return "りんご";
    }
  }
}
