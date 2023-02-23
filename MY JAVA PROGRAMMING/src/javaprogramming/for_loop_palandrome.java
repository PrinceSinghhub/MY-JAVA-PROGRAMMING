package javaprogramming;
import java.util.Scanner;
public class for_loop_palandrome {
    public static void main(String args[]){
        int num,real,result;
        Scanner khushi = new Scanner(System.in);
        num = khushi.nextInt();
        real = num;
        result = 0;
        for(;num>0;){
//            if(num>0) {
                result = (result * 10) + (num % 10);
                num = num / 10;
//            }

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