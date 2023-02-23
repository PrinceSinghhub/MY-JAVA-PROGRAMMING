package javaprogramming;
import java.util.Scanner;
public class replace_with_underscore {
    public static void main(String[] args) {

        Scanner pr = new Scanner(System.in);
        String sr = pr.nextLine();
        System.out.println(sr);

        String new_sr = sr.replace(" ","_");
        System.out.println(new_sr);

    }
}
