package javaprogramming;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);

//       todo int input
        byte a = sc.nextByte();
        int b = sc.nextInt();
        float c = sc.nextFloat();
        double d = sc.nextDouble();
        short e = sc.nextShort();
        long f = sc.nextLong();

//        todo for word user input

        String w = sc.next();
        System.out.print(w);
//
//        todo for hole line string imput

        String s = sc.nextLine();
        System.out.println(s);
//        todo for bolean data cheak

        boolean cb = sc.hasNextInt();
        boolean ch = sc.hasNextDouble();
        System.out.println(cb);


    }
}
