class Args {
  public static void main(String[] args) {
    if (args.length >= 1) {
      for(String s: args) {
        System.out.println(s);
      }
    } else {
      System.out.println("コマンドライン引数はありません");
    }
  }
}
