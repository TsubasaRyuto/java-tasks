/**
 * ユークリッドの互除法(再帰)
 */

public class EuclidRecursion {
  static int euclideanRecursive(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return EuclidRecursion.euclideanRecursive(b, a % b);
    }
  }

  public static void main(String[] args) {
    if (args.length == 2) {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);

      if (a < b) {
        int temp = a;
        a = b;
        b = temp;
      }

      System.out.println("(" + args[0] + ", " + args[1] + ") = " + EuclidRecursion.euclideanRecursive(a, b));
    } else {
      System.out.println("usage: Java a b");
    }
  }
}
