package Arrays;

import java.util.Scanner;

public class array_of_string {
    public static void main(String[] args) {
        String[] name = new String[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            String a = sc.nextLine();
            name[i] = a;
            i++;
        }

//        todo excess data
        int j = 0;
        while (j < 5) {
            System.out.println("name[" + j + "]" + " = " + name[j]);
            j++;
        }
    }
}
