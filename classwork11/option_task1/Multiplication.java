public class Multiplication implements Calc {
  public String getOperator() {
    return "x";
  }

  public int calc(int value1, int value2) {
    return value1 * value2;
  }
}

