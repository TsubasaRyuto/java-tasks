class Point3D extends Point2D {
  private double z;

  public Point3D(double x, double y, double z) {
    super(x, y);
    this.z = z;
  }

  public double getZ() {
    // フィールド z の値を返すゲッタ
    return z;
  }

  public void setZ(double z) {
    // フィールド z の値を引数 z でセットするセッタ
    this.z = z;
  }

  public double getDistance() {
    // this と原点からの距離を返すメソッド
    return Math.sqrt((int) (Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2)));
  }

  public String toString() {
    // 座標の文字列表現”(x, y, z)”を返すメソッド
    return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
  }
}
