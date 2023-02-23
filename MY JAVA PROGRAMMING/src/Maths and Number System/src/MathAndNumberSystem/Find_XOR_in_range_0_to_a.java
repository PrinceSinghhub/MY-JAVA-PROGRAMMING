package MathAndNumberSystem;

public class Find_XOR_in_range_0_to_a {
    public static void main(String[] args) {

        FindXOR(10);

    }

   static void FindXOR(int i) {

       for (int j = 0; j < i; j++) {

           if(j%4==0){
               System.out.println(j);
           }
           else if(j%4==1){
               System.out.println(1);
           }
           else if(j%4==2){
               System.out.println(j+1);
           }
           else {
               System.out.println(0);
           }
       }

    }
}
