package Arrays;
import java.util.Scanner;

public class doWhileLoop_excess_and_assigine_data_2dArrays {
    public static void main(String[] args){

        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int i = 0;
        do {
           int j = 0;

           do {
               arr[i][j] = sc.nextInt();
               j++;
           }while(j<arr[i].length);

           i++;
        }while (i<arr.length);


        //todo excessing data
        int a = 0;
        do {
            int b = 0;

            do {
                System.out.print(arr[a][b]+" ");
                b++;
            }while(b<arr[a].length);
            System.out.println();
            a++;
        }while (a<arr.length);

    }
}
