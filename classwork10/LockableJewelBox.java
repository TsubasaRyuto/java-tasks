class LockableJewelBox extends JewelBox implements Lockable {
  boolean isLock = false;
  String keyToken;

  public LockableJewelBox(boolean e) {
    super(e);
  }

  public boolean lock(MyKey key) {
    keyToken = key.getKeyToken();
    isLock = true;
    return isLock;
  }

  public boolean unlock(MyKey key) {
    if (keyToken == key.getKeyToken()) isLock = false;
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
