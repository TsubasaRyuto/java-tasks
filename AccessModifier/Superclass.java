class Superclass {
  private String text1;
  protected String text2;
  String text3;

  private void setText1(String text) {
    this.text1 = text;
    this.text2 = text;
    this.text3 = text;
    System.out.println("Set values for all fields");
    System.out.println("This method is private");
  }

  protected void setText2(String text) {
    this.text1 = text;
    this.text2 = text;
    this.text3 = text;
    System.out.println("Set values for all fields");
    System.out.println("This method is protected");
  }

  void setText3(String text) {
    this.text1 = text;
    this.text2 = text;
    this.text3 = text;
    System.out.println("Set values for all fields");
    System.out.println("This method is none bodified");
  }

  public static void main(String[] args) {
    Superclass super1 = new Superclass();

    super1.setText1("GOOD1");
    System.out.println(super1.text1);
    System.out.println(super1.text2);
    System.out.println(super1.text3);

    super1.setText2("GOOD2");
    System.out.println(super1.text1);
    System.out.println(super1.text2);
    System.out.println(super1.text3);

    super1.setText3("GOOD3");
    System.out.println(super1.text1);
    System.out.println(super1.text2);
    System.out.println(super1.text3);
  }
}
