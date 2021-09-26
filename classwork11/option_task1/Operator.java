public class Operator {
  String operator;

  Operator(String op) {
    this.operator = op;
  }

  Calc getCalculator() {
    switch(operator) {
      case "+":
        return new Sum();
      case "-":
        return new Subtraction();
      case "x":
        return new Multiplication();
      case "/":
        return new Division();
      case "%":
        return new Remainder();
      default:
        return new Sum();
    }
  }
}
