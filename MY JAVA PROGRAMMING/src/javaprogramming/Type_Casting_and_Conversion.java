package javaprogramming;
import java.util.Scanner;
public class Type_Casting_and_Conversion {
    public static void main(String[] args) {

//        todo winding data convert by automatically
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        float f1 = n;
        double d1= n;
        System.out.println(n);
        System.out.println(f1);
        System.out.println(d1);

        float x  = p.nextFloat();
        System.out.println(x);

//        todo type casting or explict conversion do manually

        int a = (int)(36.80);
        System.out.println(a);

        int a1 = (int)(p.nextDouble());
        System.out.println(a1);

        float D = (float)(p.nextDouble());
        System.out.println(D);


//        todo automatically type proation in Experession

          int a2 = 320;
          byte b = (byte)(a2);        //320%256 = 64
          System.out.println(b);

          byte a3 = 40;
          byte b2 = 50;
          byte c1 = 100;

         // here a*b are promation in ibt becouse a*b = 2000 cross the limit of byte
          int d = a3*b2/c1;
          System.out.println(d);

//        todo byte b = 50;
//        todo b = b*20;  //give error

          int number = 'A';  //becouse ascii code of A is = 65 is int
        System.out.println(number);

//        todo java follow unicode principle
        System.out.println("नमस्ते");
        System.out.println(3%40.3); //+,/,%.* are saem principle
    }
}
