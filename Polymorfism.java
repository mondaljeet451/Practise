import java.sql.SQLOutput;

public class Polymorfism {

    public int add() {
        return 0;
    }

    public int add(int A) {
        return A;

    }

    public int add(int A, int b) {
        return A + b;

    }

    public String add(String A) {

        return A;

    }

    public static void main(String[] args) {

        Polymorfism r = new Polymorfism();
        System.out.print(r.add("jeet"));
//        System.out.println(r.add("I am jeet"));


    }
}