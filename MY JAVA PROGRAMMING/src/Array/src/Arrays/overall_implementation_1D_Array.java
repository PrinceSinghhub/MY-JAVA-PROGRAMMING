package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class overall_implementation_1D_Array {
    public static void main(String[] args) {
        int[] id = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < id.length; i++) {
            int n = sc.nextInt();
            id[i] = n;
        }

        System.out.println(Arrays.toString(id));

    }
}
