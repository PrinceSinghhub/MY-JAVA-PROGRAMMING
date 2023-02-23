package JavaQuestion;

public class series_of_angstrom_number_using_function {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            boolean r = Angastrome(i);
            if(r ==true){
                System.out.print(i + " ");
            }
        }
    }

    static boolean Angastrome(int n) {
        int real = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            int cub = rem*rem*rem;
            sum+=cub;
            n/=10;
        }
        if(real == sum) {
            return true;
        }
        return false;
    }
}



