class ExceptionTest1 {
  public static void main(String[] args) {
    try {
      System.out.println("処理開始");
      int[] array = new int[10];

      System.out.println("array[100]へ値を格納します");
      // ここで例外エラーを起こす
      array[100] = 10;
      System.out.println("格納しました");
    } catch(Exception e) {
      System.out.println("-----------------------");
      System.out.println("例外エラー発生");
      System.out.println("エラー内容" + e);
      System.out.println("-----------------------");
    }
    System.out.println("処理終了");
  }
}
