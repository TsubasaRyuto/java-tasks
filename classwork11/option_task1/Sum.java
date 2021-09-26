public class Sum implements Calc {
  public String getOperator() {
    return "+";
  }

  public int calc(int value1, int value2) {
    return value1 + value2;
  }
}
