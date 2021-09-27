import java.io.*;
public class TryWithResource{
  public static void main(String[] args){
    try(PrintWriter pw = new PrintWriter(new FileWriter("hello.txt"));){
      pw.println("Hello World");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
