public class triangle {

    public static void main(String[]args){
        int A=2;
        int B=2;
        int C=3;

        if ( A==B && B==C){
            System.out.println("TRIANGLE IS EQUILATERAL");
        } else if (A==B || A==C || B==C) {
            System.out.println("TRIANGLE IS ISOSCELES");
        }
        else{
            System.out.println("TRIANGLE IS SCALENE");
        }

    }
}

