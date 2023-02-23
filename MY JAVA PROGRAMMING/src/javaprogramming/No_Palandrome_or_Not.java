package javaprogramming;
import java.util.Scanner;
public class No_Palandrome_or_Not {
    public static void main(String args[]){
        int num,real,result;
        Scanner codex = new Scanner(System.in);
        num = codex.nextInt();
        real = num;
        result =0;
        while (num>0){
            result = (result*10)+(num%10);
            num = num/10;
        }
        if(real==result){
            System.out.println("No is Palandrome");
        }
        else{
            System.out.println("No Not a Palandrome");
        }

        System.out.println(result);


    }
}
