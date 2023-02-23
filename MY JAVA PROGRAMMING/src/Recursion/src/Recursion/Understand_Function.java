package Recursion;

public class Understand_Function {
    public static void main(String[] args) {

        /*print a massage()  time without call more then time our function externally and
        with out modify function code;
         */

        massage();
    }

    static void massage() {
        System.out.println("Hello Codex Coder!");
        massage1();
    }

    static void massage1() {
        System.out.println("Hello Codex Coder!");
        massage2();
    }

    static void massage2() {
        System.out.println("Hello Codex Coder!");
        massage3();
    }

    static void massage3() {
        System.out.println("Hello Codex Coder!");
        massage4();
    }

    static void massage4() {
        System.out.println("Hello Codex Coder!");
    }
}
