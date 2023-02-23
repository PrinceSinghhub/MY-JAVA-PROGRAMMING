package SearchingAlgorithms;

import java.util.Arrays;

public class Sorted_2D_Matrixs {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 80;
        int[] res = SearchInSortedMatrix(arr,target);
        System.out.println(Arrays.toString(res));
    }

    static int[] SearchInSortedMatrix(int[][] arr, int target) {

        int row = arr.length;
        int collom = arr[0].length; // becouse may be matrix are going to empty

        if(collom==0){
            return new int[] {-1,-1};
        }

        if(row==1){
            return BinarySearch(arr,0,0,collom-1,target);
        }

        int rowStart = 0;
        int rowEnd = row-1;
        int midCollom = collom/2;

        // run the loop till 2 rows are remaining

        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart +(rowEnd-rowStart)/2;

            if(target>arr[mid][midCollom]){
                rowStart=mid;
            }
            if(target<arr[mid][midCollom]){
                rowEnd=mid;
            }
            if(arr[mid][midCollom]==target){
                return new int[] {mid,midCollom};
            }
        }

        // now we have two rows
        // check whether the target is present in that collom of 2 rows
        if(arr[rowStart][midCollom]==target){
            return new int[] {rowStart,midCollom};
        }

        if(arr[rowStart+1][midCollom]==target){
            return new int[] {rowStart+1,midCollom};
        }


//        todo now here we apply our 4 half to chek target present or not

        // search in 1st half
        if(target<=arr[rowStart][midCollom-1]){
            return BinarySearch(arr,rowStart,0,collom-1,target);
        }

        // search in 2nd half
        if(target>=arr[rowStart][midCollom+1] && target<= arr[rowStart][collom-1]){
            return BinarySearch(arr,rowStart,midCollom+1,collom-1,target);
        }

        // search in 3rd half
        if(target<=arr[rowStart+1][midCollom-1]){
            return BinarySearch(arr,rowStart+1,0,midCollom-1,target);
        }

        // search in 4th half
        if(target>=arr[rowStart+1][midCollom+1] && target<= arr[rowStart+1][collom-1]){
            return BinarySearch(arr,rowStart+1,midCollom+1,collom-1,target);
        }

        return new int[] {-1,-1};

    }
    // search in the row provided between the statrcollom and endcollom provided
    static int[] BinarySearch(int[][] arr, int row, int collomStart, int collomEnd, int target) {

        while (collomStart<=collomEnd){

            int mid = collomStart+(collomEnd-collomStart)/2;

            if(target>arr[row][mid]){
                collomStart = mid+1;
            }
            if(target<arr[row][mid]){
                collomStart = mid-1;
            }
            if(arr[row][mid]==target){
                return new int[] {row,mid};
            }
        }
        return new int[] {-1,-1};
    }
}
