package MathAndNumberSystem;

public class Find_Nth_Magic_Number {
    public static void main(String[] args) {

        int res = findMagic(6);
        System.out.println(res);
    }

    static int findMagic(int i) {
        int ans = 0;
        int base = 5;
        while (i>0){
            int last = i&1;
            ans = ans+last*base;
            i = i>>1;
            base = base*5;
        }
        return ans;
    }
}
