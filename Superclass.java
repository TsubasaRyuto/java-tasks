/**
 * Superclass / Subclass　についての学習
 * @author TsubasaRyuto
 */

// NOTE:
// Superclassという命名にしているが四角形オブジェクトを作る

final class Superclass {
  int width;
  int height;

  public Superclass(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int calculateArea() {
    return width * height;
  }
}
