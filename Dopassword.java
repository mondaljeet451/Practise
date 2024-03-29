import javax.swing.*;
import java.security.PublicKey;
import java.util.Scanner;

public class Dopassword {

    public static void main(String[] args) {
            String password = "PASSWORD@123";

            Scanner r = new Scanner(System.in);

            int max = 4;
            int attempt = 0;

        do {
            System.out.print("Enter your password : ");
            String userpassword= r.nextLine();

            if (userpassword.equals(password)){
                System.out.println("ACCESS GRANTED");
                break;
            }else{
                attempt++;
                System.out.println("ACCESS DENIED");
                System.out.println("Attempts left : " + (max - attempt));

            }

        }while(attempt < max);

        r.close();
        System.out.println("ACCOUNT BLOCKED");

    }

}
