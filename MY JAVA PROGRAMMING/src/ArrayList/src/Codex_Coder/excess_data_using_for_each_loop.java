package Codex_Coder;

import java.util.ArrayList;
import java.util.Scanner;

public class excess_data_using_for_each_loop {
    public static void main(String[] args) {

        ArrayList<Integer> mylist = new ArrayList<>();
        Scanner ne = new Scanner(System.in);

//        todo add()
        for (int i = 0; i <5;i++) {
            mylist.add(ne.nextInt());
        }

        for(int n: mylist){
            System.out.print(n+" ");
        }
    }
}
