class LockableJewelBox extends JewelBox {
  Lock lock;

  public LockableJewelBox(boolean e) {
    super(e);
    this.lock = new Lock();
  }

  boolean isLock() {
    return lock.isLock;
  }

  public boolean lock(MyKey key) {
    return lock.lock(key);
  }

  public boolean unlock(MyKey key) {
    return lock.unlock(key);
  }

  public void printEmpty() {
    if (isLock()) {
      System.out.println("ロックされています");
    } else {
      super.printEmpty();
    }
  }
}
