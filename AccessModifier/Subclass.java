// プライベートメソッドやプライベートフィールドは呼び出すことができないことを確認する

class Subclass extends Superclass {
  public static void main(String[] args) {
    Superclass super1 = new Subclass();

    // The setText1 method is private method
    // super1.setText1("GOOD1");
    // System.out.println(super1.text1);
    // System.out.println(super1.text2);
    // System.out.println(super1.text3);

    super1.setText2("GOOD2");
    // The text1 is private field
    // System.out.println(super1.text1);
    // error: text1 has private access in Superclass
    System.out.println(super1.text2);
    System.out.println(super1.text3);

    super1.setText3("GOOD3");
    // The text1 is private field.
    // System.out.println(super1.text1);
    // error: text1 has private access in Superclass
    System.out.println(super1.text2);
    System.out.println(super1.text3);
  }
}
