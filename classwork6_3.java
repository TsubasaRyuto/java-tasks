class Rectangle {
  int width;
  int height;

  Rectangle() {
    setSize(0, 0);
  }

  Rectangle(int width, int height) {
    setSize(width, height);
  }

  void setSize(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public String toString() {
    return "[" + width + ", " + height + "]";
  }
}

class PlacedRectangle extends Rectangle {
  int x;
  int y;

  PlacedRectangle() {
    setLocation(0, 0);
  }

  PlacedRectangle(int x, int y) {
    setLocation(x, y);
  }

  PlacedRectangle(int width, int height, int x, int y) {
    super(width, height);
    setLocation(x, y);
  }

  void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "[(" + x + ", " + y + "), " + "(" + width + ", " + height + ")]";
  }

  public static void main(String[] args) {
    PlacedRectangle pr1 = new PlacedRectangle();
    PlacedRectangle pr2 = new PlacedRectangle(5, 10);
    PlacedRectangle pr3 = new PlacedRectangle(100, 200, 15, 30);

    System.out.println(pr1.toString());
    // 結果: [(0, 0), (0, 0)]

    System.out.println(pr2.toString());
    // 結果: [(5, 10), (0, 0)]

    System.out.println(pr3.toString());
    // 結果: [(15, 30), (100, 200)]
  }
}
