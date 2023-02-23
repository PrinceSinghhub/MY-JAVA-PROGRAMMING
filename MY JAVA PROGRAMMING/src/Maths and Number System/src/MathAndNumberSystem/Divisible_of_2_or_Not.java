package MathAndNumberSystem;

public class Divisible_of_2_or_Not {
    public static void main(String[] args) {

        boolean res = powOf2(16);
        System.out.println(res);
    }

   static boolean powOf2(int i) {
        int res = i&(i-1);
        if(res==0){
            return true;
        }
        return false;
    }
}
