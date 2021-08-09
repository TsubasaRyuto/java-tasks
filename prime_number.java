/**
 * 100000個の素数を出力するプログラム
 * 素数判定の処理速度も同時に出力する
 */

class PrimeNumber {
  public static void main(String[] args) {
    // Note 素数個数
    int num = 100000;
    // Note 繰り返し回数（バッファ）
    int n = 10000000;
    System.out.println(num + "個の素数");
    System.out.println("n番目    素数    処理時間");
    System.out.println("--------------------------");

    int currentNum = 1;
    for (int i = 2; i <= n; i++) {
      boolean flg = true;
      long startTime = System.nanoTime();
      for (int  j = 2; j < i; j++) {
        if (i % j == 0) {
          flg = false;
          break;
        }
      }
      long endTime = System.nanoTime();
      if (flg) {
        float times = (endTime - startTime) / 1000000f;
        System.out.println(currentNum + "   " + i + "   " + String.format("%.3f", times) + "ms");
        currentNum++;
      }

      if (currentNum > num) break;
    }
  }
}
