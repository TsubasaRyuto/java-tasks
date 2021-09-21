class Superclass {
  String text;

  // final void setText(String text) {
  // finalはサブクラスでのオーバーライドができない(コンパイルエラーになる）
  void setText(String text) {
    this.text = text;
    System.out.println("This method is in the superclass");
  }

  public static void main(String[] args) {
    Superclass super1 = new Superclass();
    super1.setText("Hello, World");
    System.out.println(super1.text);
  }
}
