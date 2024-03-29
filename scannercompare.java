import java.util.Scanner;

public class scannercompare {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        int x = S.nextInt();
        int y = S.nextInt();


        if ( x > y) {
            System.out.println("X IS GREATER THAN Y ");
        } else {
            System.out.println("X IS LESSER THAN Y");
        }


    }
}