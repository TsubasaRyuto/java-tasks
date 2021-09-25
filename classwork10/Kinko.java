public class Kinko implements Lockable {
  boolean isLock = false;
  int deposit = 0;

  public Kinko(int d) {
    this.deposit = d;
  }

  public boolean lock() {
    isLock = true;
    return isLock;
  }

  public boolean unlock() {
    isLock = false;
    return isLock;
  }

  void printDeposit() {
    if (isLock) {
      System.out.println("ロックされています");
    } else {
      System.out.println("貯金額は" + deposit + "です");
    }
  }
}
