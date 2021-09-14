class Classwork5 {
  // class field
  static String a = "Hello";

  // instance field
  String b;

  // constructor
  Classwork5(String b) {
    this.b = b;
  }

  // instance method
  void c(String parameter){
    b = parameter;
  }

  // class method
  static String e(){
    // local variable 
    String f = "world";
    return f;
  }

  public static void main(String[] args){
    System.out.println(Classwork5.a + Classwork5.e());
    Classwork5 instance = new Classwork5("Hello");

    System.out.println(instance.b);
    instance.c("World");
    System.out.println(instance.b);
  }
}

