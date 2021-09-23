class ArgsMain {
  public static void main(String[] args) {
    if (args.length == 2) {
      System.out.println("こんにちは，" + args[0] + " " + args[1]);
    } else {
      System.out.println("usage: java ArgsMain 姓 名");
    }
  }
}
