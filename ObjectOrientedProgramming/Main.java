import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // インスタンス化(Circleクラスの初期化)
    Circle circleA = new Circle(10, 5, 5);
    Circle circleB = new Circle(8, 10, 10);
  

    // circleAオブジェクに面積を研鑽することを命令
    System.out.println(circleA.calculateArea());

    // circleBオブジェクに面積を研鑽することを命令
    System.out.println(circleB.calculateArea());
  }
}
