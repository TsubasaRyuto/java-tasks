class Fibonacci {
  // nの最大を999とする
  static long[] memo = new long[1000];

  static long calculate(int n) {
    if (n == 1 || n == 2) return 1;

    if (memo[n] != 0) {
      return memo[n];
    } else {
      long result = calculate(n - 1) + calculate(n - 2);
      memo[n] = result;
      return result;
    }
  }

  public static void main(String[] args) {
    for(int n = 1; n < 50; n++) {
      System.out.println(n + ": " + calculate(n));
    }
  }
}
