public class Kinko implements Lockable, PrintState {
  boolean isLock = false;
  int deposit = 0;
  String keyToken;

  public Kinko(int d) {
    this.deposit = d;
  }

  public boolean lock(MyKey key) {
    keyToken = key.getKeyToken();
    isLock = true;
    return isLock;
  }

  public boolean unlock(MyKey key) {
    if (keyToken == key.getKeyToken())
      isLock = false;
    return isLock;
  }

  public void pirnt() {
    printDeposit();
  }

  void printDeposit() {
    if (isLock) {
      System.out.println("ロックされています");
    } else {
      System.out.println("貯金額は" + deposit + "です");
    }
  }
}
