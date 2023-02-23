package MathAndNumberSystem;

public class find_no_of_set_bit {
    public static void main(String[] args) {

        String res = Integer.toBinaryString(7);
        System.out.println(res);

        int ans = countBits(7);
        System.out.println(ans);
    }

    static int countBits(int i) {
        int cout = 0;
        while (i > 0){
            cout++;
            i = i - (i&(-i));
            // i = i & (i-1) also write like that
        }
        return cout;
    }
}
