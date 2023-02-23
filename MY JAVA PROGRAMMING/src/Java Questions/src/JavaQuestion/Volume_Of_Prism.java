package JavaQuestion;

import java.util.Scanner;

public class Volume_Of_Prism {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        float s = n.nextFloat();
        float r = n.nextFloat();
        valumeofprisme(s,r);

    }

    static void valumeofprisme(float s,float r) {
        //Volume of Prism = Base area × height
        float res = 0;
        res = s*r;
        System.out.println("valumeofprisme: " + res);


    }
}
