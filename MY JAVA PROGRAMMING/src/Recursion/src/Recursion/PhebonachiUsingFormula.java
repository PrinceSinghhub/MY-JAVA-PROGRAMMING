package Recursion;

public class PhebonachiUsingFormula {
    public static void main(String[] args) {

        long res = fiboFormula(6);
        System.out.println(res);
    }

    static long fiboFormula(int n) {
        // just for demo, use long instead
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}