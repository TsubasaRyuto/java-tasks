/**
 * Superclass / Subclass　についての学習
 * @author TsubasaRyuto
 */

public class Subclass extends Superclass {
  String name;

  // コンストラクタは継承されない
  public Subclass(int width, int height, String name) {
    super(width, height);
    this.name = name;
  }

  public static void main(String[] args) {
    if (args.length > 1) {
      int width = Integer.parseInt(args[0]);
      int height = Integer.parseInt(args[1]);
      Subclass sub1 = new Subclass(width, height, "Subclass");

      System.out.println("Name = " + sub1.name);
      System.out.println("横幅 = " + sub1.width + ", 高さ = " + sub1.height);
      System.out.println("面積 = " + sub1.calculateArea());
    } else {
      System.out.println("usage: Java num-width num-height");
    }
  }
}
