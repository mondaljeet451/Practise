public class fibonacciseries {

    public static void main(String[]args){
        int n = 10;

        for (int i = 0; i < n; i++){
            System.out.print(getFibonacci(i) + " ");
        }
    }

    public static int getFibonacci(int n){

        if (n <= 1){
            return n;
        }

        int prev = 0;
        int curr = 1;
        for (int i = 2; i < n; i++) {
            int num = prev + curr;
            prev = curr;
            curr = num;
        }

        return curr;
    }

}
