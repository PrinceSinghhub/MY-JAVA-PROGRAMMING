package JavaQuestion;

public class leap_year_under_the_range {
    public static void main(String[] args) {
        for (int i = 1900; i < 2021; i++) {

            boolean r = leap_year(i);
            if(r == true){
                System.out.print(i + " ");
            }
        }

    }

    static boolean leap_year(int a) {
        if(a%400 == 0 || a%100!=0 &&a%4==0){
            return true;
        }
        return false;
    }

}
