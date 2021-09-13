// public classの定義
public class Circle {
  int diameter; // 直径
  int x; // x座標位置
  int y; // y座標位置

  // constructor
  public Circle(int diameter, int x, int y) {
    // 各フィールドに初期化時に受け取る値を代入する
    this.diameter = diameter;
    this.x = x;
    this.y = y;
  }

  // インスタンスメソッド
  double calculateArea() {
    double r = diameter / 2;
    return r * r * 3.14d;
  }
}
