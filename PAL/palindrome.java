package PAL;

import java.util.Scanner;


public class palindrome {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {

                return true;
            }
            left++;
            right--;
        }

        return false;
    }
 public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        String s = S.nextLine();

//        String str = "A man, a plan, a canal, Panama";
        if (isPalindrome(s)) {
            System.out.println("The string \"" + s + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + s + "\" is not a palindrome.");
        }
    }
}

