/**
 * ユークリッドの互除法
 */

public class Euclid {
  static int euclidean(int a, int b) {
    int m, n, k;
    m = a;
    n = b;

    do {
      k = m % n;
      m = n;
      n = k;
    } while(k != 0);

    return m;
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

      System.out.println("(" + args[0] + ", " + args[1] + ") = " + Euclid.euclidean(a, b));
    } else {
      System.out.println("usage: Java a b");
    }
  }
}
