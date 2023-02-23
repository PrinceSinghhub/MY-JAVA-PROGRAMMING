package javaprogramming;
import java.util.Scanner;
public class convert_kilometer_to_miles {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        float b = a*0.621371f;
        System.out.println(b);
    }
}
