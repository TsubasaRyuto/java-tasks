class Vector2D extends Vector {
  public Vector2D() {
    super();
  }

  public Vector2D(double x, double y) {
    super(2);
    setElement(0, x);
    setElement(1, y);
  }

  double innerProduct(Vector v) {
    // this と v の内積の値を返す
    return (getElement(0) * v.getElement(0)) + (getElement(1) * v.getElement(1));
  }

  Vector2D scalarMultiplication(double scalar) {
    // scalar * this により得られるベクトルを返す
    return new Vector2D(getElement(0) * scalar, getElement(1) * scalar);
  }

  Vector2D addVector(Vector v) {
    //this + v により得られるベクトルを返す
    return new Vector2D(getElement(0) + v.getElement(0), getElement(1) + v.getElement(1));
  }
}
