package SearchingAlgorithms;

import java.util.Scanner;

public class search_name_in_string {
    public static void main(String[] args) {

        String[] names = {"codex","coder","myname","pro","cse","IT"};
        SearchName(names);
    }

    static void SearchName(String[] names) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
            if(names[i].equals(name)){
                System.out.println(name + " are found in data!");
                break;
            }

        }
    }
}
