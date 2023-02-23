package MathAndNumberSystem;

public class ApowerB {
    public static void main(String[] args) {

        int res = AkiPowerB(3,3);
        System.out.println(res);

    }

    static int AkiPowerB(int base, int power) {

        int ans = 1;
        while (power>0){
            if((power&1)==1){
                ans*=base;
            }
            base*=base;
            power = power>>1;
        }
        return ans;

    }
}
