class LockableJewelBox extends JewelBox implements Lockable {
  boolean isLock = false;

  public LockableJewelBox(boolean e) {
    super(e);
  }

  public boolean lock() {
    isLock = true;
    return isLock;
  }

  public boolean unlock() {
    isLock = false;
    return isLock;
  }

  public void printEmpty() {
    if (isLock) {
      System.out.println("ロックされています");
    } else {
      super.printEmpty();
    }
  }
}
