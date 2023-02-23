package Arrays;

import java.util.Scanner;

public class excess_data_using_for_each_loop {
    public static void main(String[] args) {
        String[] name = new String[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            String a = sc.nextLine();
            name[i] = a;
            i++;
        }

//        todo for each loop
        for(String data:name){
            System.out.print(data+" ");
        }
    }
}
