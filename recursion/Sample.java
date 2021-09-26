class Sample {
  static int count(int v) {
    System.out.println("count(" + v + ")");

    if (v == 0) return 0;

    int tempCount = count(v - 1);
    int temp = tempCount + v;
    System.out.println(tempCount + " + " + v + " = " + temp);
    return temp;
  }

  public static void main(String[] args) {
    System.out.println(count(10));
  }
}
