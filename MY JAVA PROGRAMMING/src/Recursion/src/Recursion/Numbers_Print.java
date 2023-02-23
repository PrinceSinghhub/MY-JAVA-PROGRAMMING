package Recursion;

public class Numbers_Print {
    public static void main(String[] args) {

         /* Q print a numbers() 5 time without call more then time our function externally and
        with out modify function code;
        output = 1 2 3 4 5
         */

        numbers1(1);
    }

    static void numbers1(int n) {
        System.out.println(n);
        numbers2(2);

    }
    static void numbers2(int n) {
        System.out.println(n);
        numbers3(3);

    }
    static void numbers3(int n) {
        System.out.println(n);
        numbers4(4);

    }
    static void numbers4(int n) {
        System.out.println(n);
        numbers5(5);

    }
    static void numbers5(int n) {
        System.out.println(n);

    }
}
