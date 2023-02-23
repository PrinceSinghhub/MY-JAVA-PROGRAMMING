package Recursion;

public class PrimeNumber {
    public static void main(String[] args) {

        String res = checkPrime(21,2);
        System.out.println(res);
    }

    static String checkPrime(int num,int div) {

        while(div * div <= num) {
            if(num%div*div==0){
                return "No";
            }
            else {
                return checkPrime(num,div+1);
            }
        }

        return "Yes";
    }
}
