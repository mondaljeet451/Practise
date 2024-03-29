import java.util.Scanner;

public class ScannerEO {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
          int x = S.nextInt();

          if (x%2==0){
              System.out.println("number is even");
          }
          else{
              System.out.println("number is odd");
          }
    }
}
