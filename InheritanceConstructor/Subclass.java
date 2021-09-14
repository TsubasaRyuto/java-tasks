class Subclass extends Superclass {
  Subclass() {
    System.out.println("3: 引数なし");
  }

  Subclass(int num) {
    System.out.println("4: 引数あり" + num);
  }

  Subclass(String text) {
    super(text);
    System.out.println("5: " + text);
  }

  public static void main(String[] args){
    System.out.println("==========");
    new Superclass();

    System.out.println("==========");
    new Subclass();

    System.out.println("==========");
    new Superclass("引数あり");

    System.out.println("==========");
    new Subclass(123);

    System.out.println("==========");
    new Subclass("引数あり");
  }
}
