package MathAndNumberSystem;

public class Sum_of_nth_row_pascal_trangle {
    public static void main(String[] args) {

        int res = sumPascal(6);
        System.out.println(res);
    }

    static int sumPascal(int i) {
        int formula = 1<<(i-1);
        return formula;
    }
}
