package Codex_Coder;

import java.util.ArrayList;
import java.util.Scanner;

public class excess_data_using_loops {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

//        todo inilisation our list
        for (int i = 0; i < 3; i++) {
            mylist.add(new ArrayList<>());
        }

//        todo add data
        for (int i = 0; i < mylist.size() ; i++) {
            for (int j = 0; j < mylist.size(); j++) {
                mylist.get(i).add(sc.nextInt());
            }
        }

//        todo excess data
        for (int i = 0; i < mylist.size() ; i++) {
            for (int j = 0; j < mylist.size(); j++) {
                System.out.print(mylist.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
