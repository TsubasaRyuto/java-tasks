class Box {
  boolean isEmpty = true;
  public Box(boolean e) {
    isEmpty = e;
  }

  public void printEmpty() {
    if (isEmpty) {
      System.out.println("中身はからです");
    } else {
      System.out.println("中に何か入っています");
    }
  }
}
