/**
 * 0-100点の得点を10点幅で区切り、各ランクの度数分布（ヒストグラム）を求める
 * @author TsubasaRyuto
 */

import java.io.*;
import java.util.*;

class Histgram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] histgram = new int[11];

    System.out.println("値を入力してください");
    System.out.println("ex) 10, 35, 78, 90");
    String values = scanner.nextLine();

    // NOTE: 値を受け取るいい方法はないのか？
    String[] points = values.split(", ");

    for (int i = 0; i < points.length; i++) {
      int rank = Integer.parseInt(points[i]) / 10;

      if (0 <= rank && rank <= 10) histgram[rank]++;
    }

    for (int i = 0; i <= 10; i++) {
      String output = i * 10 + " - : " + histgram[i];
      System.out.println(output);
    }
  }
}


