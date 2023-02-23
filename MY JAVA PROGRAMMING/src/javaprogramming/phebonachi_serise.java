package javaprogramming;
import java.util.Scanner;
public class phebonachi_serise {
    public static void main(String args[]){
        int num;
        Scanner codex = new Scanner(System.in);
        System.out.print("Enert No: ");
        num = codex.nextInt();
        int first = 0,Second=1,third =0;
        for(int i = 0;i<num;i++){
            if(num>third){
                System.out.println(third);
                first = Second;
                Second = third;
                third = first+Second;
            }

        }
    }
}
