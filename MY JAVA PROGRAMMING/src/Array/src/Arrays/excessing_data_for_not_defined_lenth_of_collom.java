package Arrays;


import java.util.Arrays;

public class excessing_data_for_not_defined_lenth_of_collom {
    public static void main(String[] args) {
        // todo this type of caes we not use loop to assigone value we direct assiginr value

        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9,10,11,12}
        };

//        todo excessing data
        int i = 0;
        while(i<arr.length){
            int j = 0;
            while (j<arr[i].length){
                System.out.print(arr[i][j]+ " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
