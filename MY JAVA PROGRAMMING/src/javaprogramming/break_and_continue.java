package javaprogramming;

public class break_and_continue {
    public static void main(String[] args) {

//        todo break statement
        int i = 10;
        while(i>0){
            if (i == 5){
                break;

            }
            System.out.println(i);
            i--;
        }
        int b = 20;
        int c = 50;
        int sum = b+c;
        System.out.println(sum);

        System.out.println();
//        todo continue statement
        for(int r = 0;r<5;r++){

            if(r==3){
                System.out.println("skip element");
                continue;

            }
            System.out.println(r);

        }
    }
}
