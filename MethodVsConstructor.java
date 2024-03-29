public class MethodVsConstructor {
    public void acd(){
        System.out.println("Its a method");
    }

    MethodVsConstructor(){
        System.out.println("Its a constructor");
    }

    public static void main(String[] args) {
        MethodVsConstructor obj = new MethodVsConstructor();
        obj.acd();
    }
}
