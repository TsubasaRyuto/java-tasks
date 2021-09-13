// task 4-4
class Rectangle {
  int width;
  int height;
  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public String toString() {
    return "[" + width + ", " + height + "]";
  }

  public static void main(String[] args) {
    Rectangle rect = new Rectangle(123, 45);
    System.out.println(rect.toString());
  }
}

