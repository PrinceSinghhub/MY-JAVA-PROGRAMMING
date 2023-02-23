package Codex_Coder;

import java.util.ArrayList;
import java.util.Scanner;

public class add_data_using_loops {
    public static void main(String[] args) {

        ArrayList<Integer> mylist = new ArrayList<>();
        Scanner ne = new Scanner(System.in);

        for (int i = 0; i <10;i++) {
            mylist.add(ne.nextInt());
        }
        System.out.println(mylist);
    }
}
