public class ShapeCalculator  {

    public static void main(String[] args) {

        Shape[] sArray = new Shape[3];

        sArray[0] = new Circle(5);
        sArray[1] = new Rectangle(12,6);
        sArray[2] = new Square(9);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double finalArea =  shapeCalculator.overallArea(sArray);

        System.out.println(finalArea);
    }

    public double overallArea(Shape[] s){
        double totalArea = 0.0;


        int i=0;
        while (i<=s.length - 1){
            s[i].calculateArea();

            totalArea = totalArea + s[i].calculateArea();
            i++;
        }


        return totalArea;
    }
}
