class Point2D {
  private double x;
  private double y;

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    // フィールド x の値を返すゲッタ
    return x;
  }

  public double getY() {
    // フィールド y の値を返すゲッタ
    return y;
  }

  public void setX(double x) {
    // フィールド x の値を引数 x でセットするセッタ
    this.x = x;
  }

  public void setY(double y) {
    // フィールド y の値を引数 y でセットするセッタ
    this.y = y;
  }

  public double getDistance() {
    // this と原点からの距離を返すメソッド
    return Math.sqrt((int) (Math.pow(getX(), 2) + Math.pow(getY(), 2)));
  }

  public String toString() {
    // 座標の文字列表現”(x, y)”を返すメソッド
    return "(" + getX() + ", " + getY() + ")";
  }
}
