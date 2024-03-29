import java.util.Scanner;

public class Scannerpnz {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
             int Number = S.nextInt();

             if (Number>0){
                 System.out.println("NUMBER IS POSITIVE");
             } else if (Number<0) {
                 System.out.println("NUMBER IS NEGATIVE");
             }
             else {
                 System.out.println("number is zero");
             }
    }
}
