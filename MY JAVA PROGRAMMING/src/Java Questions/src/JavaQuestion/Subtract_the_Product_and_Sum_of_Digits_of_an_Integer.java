package JavaQuestion;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        int n = 4421;
        int r = subtractProductAndSum(n);
        System.out.println("Outpot: "+ r);
    }

    static int subtractProductAndSum(int n) {
        int mul = 1;
        int add = 0;
        int res;
        while(n>0){
            int rem = n%10;
            mul*=rem;
            add+=rem;
            n/=10;
        }
        res = mul-add;
        return res;

    }
}
