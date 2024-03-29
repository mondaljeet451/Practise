import java.util.PrimitiveIterator;

public  class Circle implements Shape {

    private int radius;

    Circle(int radius){
        this.radius= radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
//        System.out.println("THE AREA OF THE CIRCLE IS:" + area);
    }
}

