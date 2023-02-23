package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class excess_hole_array_using_Array_class {
    public static void main(String[] args) {

        String[] name = new String[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            String a = sc.nextLine();
            name[i] = a;
            i++;
        }

//        todo Array class use
        System.out.println(Arrays.toString(name));
    }
}
