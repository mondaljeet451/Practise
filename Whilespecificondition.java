import java.util.Random;
import java.util.Scanner;

public class Whilespecificondition {

    public static void main(String[] args) {
        Random r = new Random();

        int randomNum;
        do{
            randomNum = r.nextInt(100);
            System.out.println("The generated value is : " + randomNum);
        }while(randomNum < 50);

        System.out.println("Program terminated because " + randomNum + " > 50");
    }
}
