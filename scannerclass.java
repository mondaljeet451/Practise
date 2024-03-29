import java.util.Scanner;

public class scannerclass {
    public int add(int a,int b,int c){

        return a+b+c;
    }
    public float add(float a,float b,float c){

        return a+b+c;
    }
      public static void main(String[]arg){
        scannerclass s = new scannerclass();
          Scanner S = new Scanner(System.in);
          int a = S.nextInt();
          int b = S.nextInt();
          int c = S.nextInt();

          float x = S.nextFloat();
          float y = S.nextFloat();
          float z = S.nextFloat();

          System.out.println(s.add(a,b,c));
          System.out.println(s.add(x,y,z));
    }
}

