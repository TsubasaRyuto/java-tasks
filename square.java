// task4-5
class Square {
  int side;

  Square() {
    this.side = 10;
  }

  Square(int side) {
    this.side = side;
  }

  public int getArea() {
    return side * side;
  }

  public static void main(String[] args) {
    Square square1 = new Square();
    Square square2 = new Square(20);
    System.out.println(square1.getArea());
    System.out.println(square2.getArea());
  }
}
