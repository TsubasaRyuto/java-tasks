public class SimpleCalc {
  public static void main(String[] args) {
    int value1 = Integer.parseInt(args[0]);
    int value2 = Integer.parseInt(args[2]);
    Operator operator = new Operator(args[1]);

    Calc calc = operator.getCalculator();
    int result = calc.calc(value1, value2);
    System.out.println(value1 + calc.getOperator() + value2 + "=" + result);
  }
}
