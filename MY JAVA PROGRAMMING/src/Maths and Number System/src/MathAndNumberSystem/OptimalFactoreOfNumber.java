package MathAndNumberSystem;

import java.util.ArrayList;

public class OptimalFactoreOfNumber {
    public static void main(String[] args) {
        FindAllFactore(36);

    }

    static void FindAllFactore(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {

            if(n%i==0){
                if(n/i==i){ // for ignore the dublicate value
                    System.out.print(i+" ");
                }
                else{
//                  System.out.print(i+" " + n/i +" ");  not a sorted manner thats why creat  a list
                    System.out.print(i+" ");
                    list.add(n/i); // for sorted data
                }
            }

        }
        for (int i = list.size() - 1 ; i>=0 ; i--) {
            System.out.print(list.get(i)+" ");

        }
    }
}
