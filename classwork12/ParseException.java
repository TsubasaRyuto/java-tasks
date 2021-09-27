class ParseException {
  public static void main(String[] args) {
    System.out.println("処理開始");
    String number1 = "1";
    // 例外発生させるためにあえて数値でないものを代入
    String number2 = "ABC";

    try {
      System.out.println(number1 + "をint型へ変換します");
      int intValue = Integer.parseInt(number1);
      System.out.println("変換しました");
    } catch (NumberFormatException e) {
      System.out.println("変換に失敗しました");
      System.out.println(number1 + "は数値ではないです");
      System.out.println("例外エラー: " + e);
      e.printStackTrace();
    }

    try {
      System.out.println(number2 + "をint型へ変換します");
      int intValue = Integer.parseInt(number2);
      System.out.println("変換しました");
    } catch (NumberFormatException e) {
      System.out.println("変換に失敗しました");
      System.out.println(number2 + "は数値ではないです");
      System.out.println("例外エラー: " + e);
      e.printStackTrace();
    }

    System.out.println("処理終了");
  }
}
