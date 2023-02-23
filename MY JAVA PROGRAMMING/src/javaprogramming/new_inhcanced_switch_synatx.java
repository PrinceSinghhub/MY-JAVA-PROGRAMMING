package javaprogramming;

import java.util.Scanner;

public class new_inhcanced_switch_synatx {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);

        int age = p.nextInt();


//        todo no need to break
        switch (age) {
            case 18 ->{
                System.out.println("Hello ji");
                System.out.println("Hello ji");
                System.out.println("Hello ji");
            }
            case 15 -> System.out.println("sorry");
            case 10 -> System.out.println("Happy biday");
            default -> System.out.println("tHANKGYOU");
        }

    }
}
