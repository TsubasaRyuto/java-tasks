public class Polynomial extends Function {
  int degree;
  double[] coefficients;

  Polynomial(double[] coefficients) {
    this.coefficients = coefficients;
  }

  @Override
  public double f(double x) {
    double tempCount = 0.0;

    for (int i = coefficients.length - 1; i >= 0; i--) {
      if (i > 0) {
        tempCount += (coefficients[i] * Math.pow(x, i));
      } else {
        tempCount += coefficients[i];
      }
    }

    return tempCount;
  }

  @Override
  public Polynomial differentiates() {
    double[] temp = new double[coefficients.length - 1];

    for (int i = 1; i < coefficients.length; i++) {
      temp[i - 1] = coefficients[i] * i;
    }

    return new Polynomial(temp);
  }

  public String toString() {
    String tempText = "";

    for (int i = coefficients.length - 1; i >= 0; i--) {
      if (i > 1) {
        tempText += (coefficients[i] + "x" + "^" + i + " + ");
      } else if (i == 1) {
        tempText += (coefficients[i] + "x" + " + ");
      } else {
        tempText += coefficients[i];
      }
    }

    return tempText;
  }

  public static void main(String[] args) {
    double[] coefficients = {1, 2, 3};
    Polynomial p = new Polynomial(coefficients);
    System.out.println("p(x) = " + p.toString());
    System.out.println("p(" + 2 + ") = " + p.f(2));

    Polynomial q = p.differentiates();
    System.out.println("q(x) = " + q.toString());
    System.out.println("q(" + 2 + ") = " + q.f(2));


    // NOTES 出力結果
    // p(x) = 3.0x^2 + 2.0x + 1.0
    // p(2) = 17.0
    // q(x) = 6.0x + 2.0
    // q(2) = 14.0
  }
}
