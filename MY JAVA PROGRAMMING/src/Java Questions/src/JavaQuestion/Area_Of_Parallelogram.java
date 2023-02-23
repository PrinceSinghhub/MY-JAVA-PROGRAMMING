package JavaQuestion;

import java.util.Scanner;

public class Area_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        float base = sc.nextFloat();
        System.out.print("Enter Height: ");
        float height = sc.nextFloat();

        float area = base*height;
        System.out.println("Area of ParalleloGrame: "+ area);
    }
}
