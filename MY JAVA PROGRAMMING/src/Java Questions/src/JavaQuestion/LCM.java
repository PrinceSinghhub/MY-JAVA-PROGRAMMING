package JavaQuestion;

public class LCM {
    public static void main(String[] args) {
        int a,b;
        a = 54;
        b = 24;
        lcm(a,b);
    }

    static void lcm(int a, int b) {
        int big;
        if(a>b){
            big = a;
        }
        else{
            big = b;
        }
        while (true){
            if(big%a==0 && big%b == 0){
                System.out.println("LCM IS: " + big);
                break;
            }
            big+=1;
        }
    }
}
