package teikyo.ics.csp1lec14;
import teikyo.ics.csp1lec14.staff.*;
import teikyo.ics.csp1lec14.student.*;
import java.util.Arrays;

public class Lec14Main {
  // 配列を指定数分、分割するメソッド
  // ex) { 1, 2, 3, 4 } => {{ 1, 2 }, { 3, 4 }}
  static private String[][] sliceArray(String[] array, int number) {
    int length = (int) Math.ceil((double) (array.length / number));
    String[][] newArray = new String[length][number];

    for (int i = 0; i < length; i++) {
      newArray[i] = Arrays.copyOfRange(array, i * number, (i + 1) * number);
    }

    return newArray;
  }

  public static void main(String[] args){
    try {
      if (args.length % 3 != 0 || args.length == 0) {
        throw new ArrayIndexOutOfBoundsException();
      }

      String[][] dividedArgs = sliceArray(args, 3);
      for (String[] n: dividedArgs) {
        switch (n[0]) {
          case "teacher":
            Teacher t = new Teacher();
            t.setValues(n[1], Integer.parseInt(n[2]));
            t.printInfo();
            break;
          case "student":
            Student s = new Student();
            s.setValues(n[1], Integer.parseInt(n[2]));
            s.printInfo();
            break;
          default:
            throw new ArrayIndexOutOfBoundsException();
        }
      }
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("プログラム引数を見直してください");
    } catch(NumberFormatException e) {
      System.out.println("年齢が正しく入力されていません");
    }
  }
}
