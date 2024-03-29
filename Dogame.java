import java.util.Scanner;

public class Dogame {

    public static void main(String[] args) {
        int num = 65;

        Scanner r = new Scanner(System.in);

        do{
            int userguess = r.nextInt();

            boolean inputedans = userguess < 100 && userguess > 0;

            if (userguess == num){
                System.out.println("INSIDE RANGE & CORRECT GUESS");
                break;
            }
            else if (inputedans && userguess != num){
                System.out.println("INSIDE RANGE BUT NOT CORRECT");
            }
            else{
                System.out.println("INCORRECT");
            }
        }while(true);

        r.close();
    }
}
