package MathAndNumberSystem;

public class LCM_of_Number {

    public static void main(String[] args) {

        int a = 4;
        int b = 6;

        int ans = LCM(a,b);
        System.out.println(ans);
    }

    static int LCM(int a, int b) {

        return (a*b)/HCF(a,b);
    }

    static int HCF(int a, int b) {

        if(a==0){
            return b;
        }
        return HCF(b%a,a);
    }

}
