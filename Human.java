import java.util.Arrays;

public class Human {

    public static void main(String[] args) {

    Bottle kiran = new Bottle(1000, "lemonwater");
    Bottle jeet = new Bottle(500, "lassi");

//    jeet.setQuantity(1000);
//    jeet.setWatertype("lassi");
//
//    kiran.setQuantity(500);
//    kiran.setWatertype("buttermilk");

    System.out.println(kiran);
    System.out.println(jeet);


//    int[] num = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(num));
//
    }
}

class Bottle {
    int quantity;
    String watertype;

    // constructor based getter and setter

    public Bottle(int quantity, String watertype){
        this.quantity = quantity;
        this.watertype = watertype;
    }

    // getters

//    public int getQuantity() {
//        return quantity;
//    }
//
//    public String getWatertype() {
//        return watertype;
//    }

    // setters

//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public void setWatertype(String watertype) {
//        this.watertype = watertype;
//    }

    public String toString() {
        return watertype +" "+ quantity;
    }
}
