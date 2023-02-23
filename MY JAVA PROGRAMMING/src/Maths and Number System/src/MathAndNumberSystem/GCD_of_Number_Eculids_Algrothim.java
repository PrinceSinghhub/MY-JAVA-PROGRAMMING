package MathAndNumberSystem;

public class GCD_of_Number_Eculids_Algrothim {
    public static void main(String[] args) {

        int a = 4;
        int b = 9;

        int ans = GCD(a,b);
        System.out.println(ans);
    }

    static int GCD(int a, int b) {

        if(a==0){
            return b;
        }

        return GCD(b%a,a);
    }
}
