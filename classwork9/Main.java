// これがないとコンパイラエラーになる
import food.*;

// 完全限定名でのimport
// import food.Apple;
// import food.Lemon;


class Main {
  public static void main(String[] args) {
    // 完全限定名での呼び出し
    // food.Apple apple = new food.Apple();
    // food.Lemon lemon = new food.Lemon();

    Apple apple = new Apple();
    Lemon lemon = new Lemon();
    System.out.println(apple.getName("ja"));
    System.out.println(lemon.getName("ja"));
  }
}
