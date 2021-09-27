public class MyDivider {
  public static int divide(int a, int b) throws MyDividerException  {
    if (b == 0) throw new MyDividerException("0 で割ろうとしたので例外が発生しました");
    return a / b;
  }

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("usage: MyDivider a b");
      return;
    }

    try {
      int value1 = Integer.parseInt(args[0]);
      int value2 = Integer.parseInt(args[1]);

      int result = MyDivider.divide(value1, value2);
      System.out.println("args[0] / args[1] = " + result);
    } catch(MyDividerException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("usage: MyDivider a b, a and b is number");
    }
  }
}
