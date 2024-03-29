package IFSTATEMENT;

import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println(isleapyear(year));
    }
    public static boolean isleapyear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        return false;
    }
}