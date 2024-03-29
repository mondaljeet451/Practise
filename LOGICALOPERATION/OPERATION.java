package LOGICALOPERATION;

import java.util.Scanner;

public class OPERATION {
    public int add(int a,int b){

        return a+b;
    }
    public int subtract(int a,int b) {

        return a-b;
    }
    public int multiply(int a,int b) {

        return a*b;
    }
    public int division(int a,int b) {

        return a/b;
    }
    public static void main(String []arg){
        OPERATION P = new OPERATION();
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();
        System.out.println(P.add(a,b));
        System.out.println(P.subtract(a,b));
        System.out.println(P.multiply(a,b));
        System.out.println(P.division(a,b));
    }
}
