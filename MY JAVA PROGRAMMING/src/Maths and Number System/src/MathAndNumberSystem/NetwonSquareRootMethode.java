package MathAndNumberSystem;

public class NetwonSquareRootMethode {
    public static void main(String[] args) {

        double res = NewtonMethod(36);
        System.out.println(res);
    }

    static double NewtonMethod(int i) {

        double X = i;
        double root;

        while (true){

            root = 0.5 * (X+i/X); // (X+i/X)/2 also write
            if(Math.abs(root-X)<1){
                break;
            }
            X = root;
        }

        return root;
    }
}
