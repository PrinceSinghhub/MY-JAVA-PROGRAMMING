package javaprogramming;
import java.util.Scanner;
public class convert_lower_case {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        String sr = pr.nextLine();

        String new_str = sr.toLowerCase();
        System.out.println("original "+ sr);
        System.out.println(new_str);
    }
}
