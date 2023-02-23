package MathAndNumberSystem;

public class findSingleDigit {
    public static void main(String[] args) {

        int[] arr = {1,2,1,2,5};
        int res = findElement(arr);
        System.out.println(res);

    }

    static int findElement(int[] arr) {

        int unique = 0;
        for(int n : arr){
             unique = unique ^ n;
        }
        return unique;
    }
}
