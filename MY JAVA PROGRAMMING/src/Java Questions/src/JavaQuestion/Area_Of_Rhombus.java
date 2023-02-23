package JavaQuestion;

import java.util.Scanner;

public class Area_Of_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Diagonal1: ");
        float Diagonal = sc.nextFloat();
        System.out.print("Enter Diagonal2: ");
        float 	Diagonal1 = sc.nextFloat();

        float area = Diagonal*Diagonal1/2;
        System.out.println("Area of Rhombus: "+ area);
    }
}
