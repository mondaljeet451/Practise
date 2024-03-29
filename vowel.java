
import java.util.Scanner;

public class vowel {

    public static void main(String[]args){
           String[]vowel = {"a","e","i","o","u"};

        Scanner Y = new Scanner(System.in);
          String input  = Y.nextLine();

          boolean p = checker(vowel,input);
        System.out.println(p);
    }

    public static boolean checker(String[]vowel,String input){
        for (String k : vowel){
            if (k.equalsIgnoreCase(input)){
                return true;
            }
        }
        return false;
    }

}
