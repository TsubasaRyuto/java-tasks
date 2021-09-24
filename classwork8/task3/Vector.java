abstract class Vector {
  private int dimension;
  private double[] elements;

  public Vector() {
    this.dimension = 2;
    this.elements = new double[dimension];
  }

  public Vector(int dimension) {
    this.dimension = dimension;
    this.elements = new double[dimension];
  }

  public int getDimension() {
    // フィールド dimension を返すゲッタ
    return dimension;
  }

  public double getElement(int i) {
    // フィールド elements の i 番目の要素を返すゲッタ
    return elements[i];
  }

  public void setDimension(int dimension) {
    // フィールド dimension をセットし，フィールドelements を長さ dimension で初期化するセッタ
    this.dimension = dimension;
    this.elements = new double[dimension];
  }

  public void setElement(int i, double e) {
    // フィールド elements の i 番目の要素を引数 e でセットするセッタ
    elements[i] = e;
  }

  public String toString() {
    // ベクトルの文字列表現(x1, x2, ..., xn)を返すメソッド
    String temp = "(";

    for (int i = 0; i < dimension; i++ ) {
      if (i != dimension - 1) {
        temp += (elements[i] + ", ");
      } else {
        temp += (elements[i] + ")");
      }
    }

    return temp;
  }

  // this と v の内積を返す抽象メソッド
  abstract double innerProduct(Vector v);

  // this を scalar 倍して得られるベクトル scalar*this を返す抽象メソッド
  abstract Vector scalarMultiplication(double scalar);

  //this と v との加算により得られるベクトル this + v を返す抽象メソッド
  abstract Vector addVector(Vector v);
}
