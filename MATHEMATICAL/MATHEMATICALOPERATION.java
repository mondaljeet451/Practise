package MATHEMATICAL;

public class MATHEMATICALOPERATION {
    public int ADD(int A,int B){
         return A+B;
    }
    public int SUBTRACT(int A,int B){

        return A-B;
    }
    public int MULTIPLE(int A,int B) {
        return A*B;
    }
    public int DIVISION(int A,int B){
        return A/B;
    }
    public static void main(String[]arg){
        MATHEMATICALOPERATION M = new MATHEMATICALOPERATION();
        System.out.println(M.ADD(30,40));
        System.out.println(M.SUBTRACT(90,60));
        System.out.println(M.MULTIPLE(50,50));
        System.out.println(M.DIVISION(40,20));

    }
}
