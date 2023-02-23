package JavaQuestion;
import java.util.Scanner;

public class press_x_for_end {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while(true){
            String c = s.next();
            if (c.equals("x")) {
                System.out.println("addition of sum many time is: " + sum);
                break;
            }
            sum+=1;

        }
    }
}
