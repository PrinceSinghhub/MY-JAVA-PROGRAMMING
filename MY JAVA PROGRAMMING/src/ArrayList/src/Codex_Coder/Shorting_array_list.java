package Codex_Coder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;
public class Shorting_array_list {
    public static void main(String[] args) {

        ArrayList<Integer> mylist = new ArrayList<>();
        Scanner ne = new Scanner(System.in);

//        todo add()
        for (int i = 0; i <5;i++) {
            mylist.add(ne.nextInt());
        }

        Collections.sort(mylist);
        System.out.println(mylist);


    }
}
