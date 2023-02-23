package Arrays;

import java.util.Scanner;

public class excessing_data_using_Whileloops_2dArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i<3){
            int j = 0;
            while (j<3){
                System.out.print("Enter no: ");
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

//      todo excessing data
        int a = 0;
        while (a<3){
            int b = 0;
            while (b<3){
                System.out.print(arr[a][b]+" ");
                b++;
            }
            System.out.println();
            a++;
        }


    }

}

