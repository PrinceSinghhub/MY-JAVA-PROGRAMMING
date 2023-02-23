package javaprogramming;
import java.util.Scanner;
public class replace_name_string {
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);
        String str = p.nextLine();

        System.out.println("Dear "+"<name> "+"Thank you for using java");
        System.out.println("Dear "+str+" Thank you for using java");
    }
}
