package JavaQuestion;

import java.util.Scanner;

public class Perimeter_Of_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        P=4*a
        System.out.print("Enter side: ");
        float side = sc.nextFloat();


        float result = 4*side;
        System.out.println("P of Rhombus: " + result);
    }
}



