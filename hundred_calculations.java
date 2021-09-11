/**
 * HundredCalculationsは指定した演算子の１桁計算をランダムで100問出題するプログラム
 * @author TsubasaRyuto
 */

import java.io.*;
import java.util.Scanner;
import java.util.Random;

class HundredCalculations {
  public static int n = 100;
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("演算子を入力してください");
    String operator = scanner.next();

    for (int i = 0; i < n; i++) {
      String value1 = getRandomValue();
      String value2 = getRandomValue();

      String output = String.format("%s %s %s = ", value1, operator.toString(), value2);
      System.out.println(output);
    }
  }

  public static String getRandomValue() {
    Random random = new Random();
    int randomInt = random.nextInt(9);
    return Integer.valueOf(randomInt).toString();
  }
}
