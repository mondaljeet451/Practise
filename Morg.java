public class Morg extends Methodoverriding {

    @Override
    public int add(int x, int y){
        return x - y;
    }

    public static void main(String[] args) {
        Morg child = new Morg();
        Methodoverriding parent = new Methodoverriding();

        System.out.println(child.add(10, 5));
        System.out.println(parent.add(10, 5));
    }
}

