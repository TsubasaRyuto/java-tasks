public interface Lockable {
  boolean lock(MyKey key);
  boolean unlock(MyKey key);
}
