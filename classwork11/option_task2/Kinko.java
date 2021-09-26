public class Kinko extends Lock implements PrintState {
  int deposit = 0;

  public Kinko(int d) {
    this.deposit = d;
  }

  public void print() {
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
