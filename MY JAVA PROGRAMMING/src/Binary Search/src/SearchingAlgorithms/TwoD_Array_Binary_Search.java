package SearchingAlgorithms;

import java.util.Arrays;

public class TwoD_Array_Binary_Search {
    public static void main(String[] args) {

        int[][] myarr = {{10,20,30,40},
                         {15,25,35,45},
                         {28,29,37,49}};

        int target = 25;

        int[] res  = SearchIn2DArray(myarr,target);
        System.out.println(Arrays.toString(res));
    }

    static int[] SearchIn2DArray(int[][] myarr, int target) {



        int row = 0;
        int collom = myarr[0].length-1; //[0] becousse may be row and collom length are goining to different eg = 3X4

        while (row < myarr.length && collom >=0){


            if(target==myarr[row][collom]){
                return new int[] {row,collom};
            }

            if(target>myarr[row][collom]){
                row++;
            }

//            if(target<myarr[row][collom]){    //also write like that bur give some ans wrong
//                collom--;
//            }

            else {         //also write like that
                collom--;
            }
        }

        return new int[] {-1,-1}; // if data are not found
    }
}
