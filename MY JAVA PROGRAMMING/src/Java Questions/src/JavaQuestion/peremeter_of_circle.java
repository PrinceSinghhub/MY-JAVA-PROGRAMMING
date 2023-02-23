package JavaQuestion;

import java.util.Scanner;

public class peremeter_of_circle {
    static float pi = 3.1416f;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();

        float result = 2*pi*radius;
        System.out.println("POC is: " + result);


    }
}
