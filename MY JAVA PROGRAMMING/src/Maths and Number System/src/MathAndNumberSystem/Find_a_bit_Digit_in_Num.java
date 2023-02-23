package MathAndNumberSystem;

public class Find_a_bit_Digit_in_Num {
    public static void main(String[] args) {

        int res = countBit(10);
        System.out.println(res);
    }

    static int countBit(int i) {

        int base = 2;
        int ans = (int)(Math.log(i)/Math.log(base)+1);
        return ans;
    }
}
