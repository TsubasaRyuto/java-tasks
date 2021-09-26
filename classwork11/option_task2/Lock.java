public class Lock implements Lockable {
  boolean isLock = false;
  String keyToken;

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
}
