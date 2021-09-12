/**
 * 点数の順位付け（単純アルゴリズム）
 * @author TsubasaRyuto
 */

/**
 * NOTE:
 * 配列は３章型なので、引数に渡した配列に値を格納すると
 * 別の場所でもその値を参照することができる
 * これはメモリのアドレスを保持しているため
 * このような変数を参照型変数という
*/

import java.io.*;
import java.util.*;

class SimpleRanking {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("点数を入力してください");
    System.out.println("ex) 10, 35, 78, 90");
    String values = scanner.nextLine();

    String[] points = values.split(", ");
    int[] ranking = new int[points.length];

    append_ranking(points, ranking);

    output(points, ranking);
  }

  private static void append_ranking(String[] points, int[] ranking) {
    for (int i = 0; i < points.length; i++) {
      ranking[i] = 1;

      for (int j = 0; j < points.length; j++) {
        if (Integer.parseInt(points[j]) > Integer.parseInt(points[i])) ranking[i]++;
      }
    }
  }

  private static void output(String[] points, int[] ranking) {
    System.out.println("得点  順位");

    for (int i = 0; i < points.length; i++) {
      System.out.println(points[i] + "  " + ranking[i]);
    }
  }
}
