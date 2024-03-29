public class Methodoverriding extends Another{

    public int add(int x, int y){
        return x - y;
    }

    public static void main(String[] args) {
        Another parent = new Another();
        Methodoverriding child = new Methodoverriding();

        System.out.println(parent.add(10, 5));
        System.out.println(child.add(10, 5));
    }

}

class Another {

    public int add(int x, int y){
        return x + y;
    }
}