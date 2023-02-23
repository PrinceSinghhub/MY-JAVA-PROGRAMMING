package MathAndNumberSystem;

public class FactoreOfNumber {
    public static void main(String[] args) {

        FindAllFactore(20);

    }

    static void FindAllFactore(int i) {
        for (int j = 1; j <= i ; j++) {

            if(i%j==0){
                System.out.print(j+" ");
            }

        }
    }
}
