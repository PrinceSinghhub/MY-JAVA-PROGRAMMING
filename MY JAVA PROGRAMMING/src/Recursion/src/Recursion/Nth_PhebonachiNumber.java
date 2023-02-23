package Recursion;

public class Nth_PhebonachiNumber {
    public static void main(String[] args) {

        int res  = nth_Phebonachi(4);
        System.out.println(res);
    }

   static int nth_Phebonachi(int i) {

        if(i<2){
            return i;
        }

        return nth_Phebonachi(i-1) + nth_Phebonachi(i-2);
    }
}
