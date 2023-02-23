package Recursion;

public class RecursionIntroduction {
    public static void main(String[] args) {

        // Q print 1 to 5 using recursion
        PrintNumbers(1);
    }

    static void PrintNumbers(int i) {

        //todo base case where function stop now
        if(i==5){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        PrintNumbers(i+1);
    }
}
