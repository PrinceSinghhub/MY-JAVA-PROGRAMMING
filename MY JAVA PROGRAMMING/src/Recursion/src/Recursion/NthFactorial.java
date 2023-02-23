package Recursion;

public class NthFactorial {
    public static void main(String[] args) {

        int res = nthFactorial(5,1);
        System.out.println(res);
    }

    static int nthFactorial(int nums,int ans) {

        if(nums==0){
            return ans;
        }
        ans*=nums;
        return nthFactorial(nums-1,ans);
    }
}
