import java.util.Scanner;

public class ScannerPrime {

    public static void main(String[] args) {

          Scanner R = new Scanner(System.in);
          int x = R.nextInt();

        if (x%1==0 && x%x==0){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}
