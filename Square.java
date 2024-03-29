import java.util.PrimitiveIterator;

public  class Square implements Shape {

    private int Length;


    public Square(int Length){
        this.Length=Length;
    }
    @Override
    public double calculateArea() {
        return Length*Length;
//        System.out.println(area);
    }
}

