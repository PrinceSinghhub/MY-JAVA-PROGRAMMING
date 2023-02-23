package Codex_Coder;

import java.util.ArrayList;
import java.util.Scanner;

public class excessing_data_usining_loops {
    public static void main(String[] args) {

        ArrayList<Integer> mylist = new ArrayList<>();
        Scanner ne = new Scanner(System.in);

//        todo add()
        for (int i = 0; i <5;i++) {
            mylist.add(ne.nextInt());
        }

//        todo excess data
        for (int a = 0; a< mylist.size(); a++) {
            System.out.print(mylist.get(a)+" ");
        }
    }
}
