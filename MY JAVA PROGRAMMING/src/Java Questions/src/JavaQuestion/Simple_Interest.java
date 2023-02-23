package JavaQuestion;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int principle = n.nextInt();
        float rate = n.nextFloat();
        short time = n.nextShort();
        float si = SI(principle,rate,time);
        System.out.println("Simple Intrest is: " + si);
    }

    static float SI(int principle, float rate, short time) {
        float result = (principle*rate*time)/100;
        return result;
    }


}
