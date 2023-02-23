package JavaQuestion;

import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter length: ");
        float lenth = sc.nextFloat();
        System.out.print("Enter width: ");
        float width = sc.nextFloat();

        float area = lenth*width;
        System.out.println("Area of Rectangle: "+ area);

    }
}
