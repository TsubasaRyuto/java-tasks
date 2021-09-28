package teikyo.ics.csp1lec14;
import teikyo.ics.csp1lec14.staff.*;
import teikyo.ics.csp1lec14.student.*;
import java.util.Arrays;

public class Lec14Main {
  // 配列を分割するメソッド
  // ex) { 1, 2, 3, 4 } => {{ 1, 2 }, { 3, 4 }}
  static private String[][] sliceArray(String[] array) {
    String[][] newArray = new String[100][4];
    int newArrayIndex = 0;

    for (int i = 0; i < array.length; i++) {
      String message = array[i].toLowerCase();
      if (!(message.equals("teacher") || message.equals("student"))) continue;

      int size = 3;

      if (message.equals("student")) size = 4;

      newArray[newArrayIndex] = Arrays.copyOfRange(array, i, i + size);
      newArrayIndex++;
    }

    return newArray;
  }

  public static void main(String[] args){
    try {
      if (args.length < 3) {
        throw new ArrayIndexOutOfBoundsException();
      }

      String[][] dividedArgs = sliceArray(args);
      for (String[] n: dividedArgs) {
        if (n[0] == null) break;

        switch (n[0].toLowerCase()) {
          case "teacher":
            Teacher t = new Teacher();
            t.setValues(n[1], Integer.parseInt(n[2]));
            t.printInfo();
            break;
          case "student":
            Student s = new Student(n[3]);
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
