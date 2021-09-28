package teikyo.ics.csp1lec14;

public class Lec14Main2 {
  private static void getAllSuperclass(Class c) {
    Class s = c.getSuperclass();

    if (s == null) return;

    System.out.println("Super class is " + s.getCanonicalName());
    getAllSuperclass(s);
  }

  public static void main(String[] args) {
    try {
      Class c = Class.forName(args[0]);

      System.out.println("Target class is " + c.getCanonicalName());
      getAllSuperclass(c);
    } catch(Exception e) {
        e.printStackTrace();
    }
  }
}
