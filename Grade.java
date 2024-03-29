import java.util.Scanner;

public class Grade {

    public static void main(String[]args){
        Scanner S = new Scanner(System.in);
        int x = S.nextInt();

        if (x >= 80){
            System.out.println("STUDENT GRADE IS A");
        } else if (x > 60){
            System.out.println("STUDENT GRADE IS B");
        } else if (x > 40){
            System.out.println("STUDENT GRADE IS C");
        } else if (x > 20){
            System.out.println("STUDENT GRADE IS D");
        } else {
            System.out.println("STUDENT GRADE IS F");
        }
    }
}
