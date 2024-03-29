import java.sql.SQLOutput;
import java.util.Scanner;

public class CALCULATOR {
    public int add(int x,int y){
        return x+y;
    }
      public int subtract(int x,int y){
        return x-y;
      }
      public static void main(String[]arg){
          CALCULATOR C = new CALCULATOR();
          Scanner s = new Scanner(System.in);
          int x = s.nextInt();
          int y = s.nextInt();
          System.out.println("Addition = " + C.add(x,y));
          System.out.println("Subtraction = " + C.subtract(x,y));
      }

}
