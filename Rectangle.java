import java.util.PrimitiveIterator;

public  class Rectangle implements Shape {

    private int Length;
    private int Breath;


    public Rectangle(int Length, int Breath) {
        this.Length = Length;
        this.Breath = Breath;
    }

    @Override
    public double calculateArea() {
        return Length*Breath;
//        System.out.println(area);
    }
}