class Subclass extends Superclass {
  @Override
  void setText(String text) {
    this.text = text;
    System.out.println("This method overrided in the subclass");
  }

  public static void main(String[] args) {
    Subclass sub1 = new Subclass();
    sub1.setText("Hello, World");
    System.out.println(sub1.text);
  }
}
