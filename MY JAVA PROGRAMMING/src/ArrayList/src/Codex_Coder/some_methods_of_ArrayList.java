package Codex_Coder;

import java.util.ArrayList;
import java.util.Scanner;

public class some_methods_of_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> mylist = new ArrayList<>();
        Scanner ne = new Scanner(System.in);

//        todo add()
        for (int i = 0; i <5;i++) {
            mylist.add(ne.nextInt());
        }
        System.out.println(mylist);

//        todo set()
        mylist.set(2,200);
        System.out.println(mylist);

//        todo remove()
        mylist.remove(4);
        System.out.println(mylist);

//        todo get()
        System.out.println(mylist.get(3));

//        todo size()
        System.out.println(mylist.size());

    }
}
