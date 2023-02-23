package MathAndNumberSystem;

public class PrimeOrNot {
    public static void main(String[] args) {

        for (int i = 2; i <= 10; i++) {
            PrimeOrnOT(i);

        }
    }
    static void PrimeOrnOT(int i) {

        boolean res = true;

        int c = 2;
        while (c*c<=i){
            if(i%c==0){
                res = false;
                break;
            }
            c++;
        }

        if (res){ // alswo write if(res==true)
            System.out.println("Prime Number"+" "+i);

        }
        else {
            System.out.println("Not A Prime Number");
        }

    }
}
