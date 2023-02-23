package javaprogramming;
import java.util.Scanner;
public class string_are_palandrome {
    public static void main (String args[]){
        String data="";

        Scanner pr = new Scanner(System.in);
        System.out.print("Enter Your Sting: ");
        String codex = pr.nextLine();
        int len = codex.length();

        for(int i = len-1;i>=0;i--) {
            data=data+codex.charAt(i);

        }

        if(codex.equals(data)){
            System.out.println("Yes String is a Palandrome");
            System.out.println("String : " +codex);
            System.out.println("data : " +data);
        }
        else {
            System.out.println("String is Not a Palandrome");
            System.out.println("String : " +codex);
            System.out.println("data : " +data);
        }


    }
}
