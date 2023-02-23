package Arrays;

import java.util.Arrays;

public class using_Arrays_function_to_excess_data {
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
            System.out.println(Arrays.toString(arr[i]));
            i++;
        }

    }
}
