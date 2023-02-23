package Arrays;

import java.util.Scanner;

public class Assigine_value_using_loops_2DAaaray {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextInt();

            }

        }
    }
}
