package MathAndNumberSystem;

public class PerfectSquareRoot {
    public static void main(String[] args) {

        int N = 40;
        int decimalPlace = 3;
        FindPerfectSruare(N,decimalPlace);
    }

    static void FindPerfectSruare(int n, int decimalPlace) {


//        todo for perfect sqirt
        int start = 0;
        int end = n;


        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid==n){
                System.out.println(mid);
                break;
            }
            if(mid*mid>n){
                end = mid-1;
            }
            if(mid*mid<n){
                start = mid+1;
            }
        }

//        todo for decimal sqirt
        double increment = 0.1;
        double root = 0.0;
        for (int i = 0; i < decimalPlace; i++) {
            
            while (root*root<=n){
                 root+=increment;
//                System.out.println(root);
            }

            root-=increment;
            increment /=10;


        }
        System.out.printf("%.3f",root);
    }
}
