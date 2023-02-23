package MathAndNumberSystem;

public class EvernOrOld {
    public static void main(String[] args) {

        int n = 68;
        System.out.println(isEven(n));
    }

    static boolean isEven(int n) {
        return (n & 1 ) == 0;
        }
    }

