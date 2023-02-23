package MathAndNumberSystem;

public class Find_XOR_in_range_a_to_b {
    public static void main(String[] args) {

        int res = FindXOR(5) ^ FindXOR(13-1);
        System.out.println(res);

    }

    static int FindXOR(int j) {

        if(j%4==0){
            return j;
        }
        else if(j%4==1){
            return 1;
        }
        else if(j%4==2){
            return j+1;
        }
        return 0;
    }
}
