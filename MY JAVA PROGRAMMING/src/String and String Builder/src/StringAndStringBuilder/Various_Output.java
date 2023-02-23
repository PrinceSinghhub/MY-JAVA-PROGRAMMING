package StringAndStringBuilder;

import java.util.Arrays;

public class Various_Output {
    public static void main(String[] args) {

        System.out.println(56);
        // why print 56
        /*
        becouse the region is println call ------ valueof call ---- toString()
         */

        System.out.println("codex coder");
         /*
        becouse the region is println call ------ valueof call ---- toString()
         */

        System.out.println(new int[] {1,2,3,4,5});
         /* give random number
        becouse the region is println call ------ valueof call ---- obj.toString()
        this tostring methode of String
         */

        System.out.println(Arrays.toString(new int[] {1,2,3,4,5}));
         /* give our array
        becouse the region is println call ------ valueof call ---- obj.toString()
        this tostring methode of Arrays this take int take int[]  according to data type of out array
         */


    }
}
