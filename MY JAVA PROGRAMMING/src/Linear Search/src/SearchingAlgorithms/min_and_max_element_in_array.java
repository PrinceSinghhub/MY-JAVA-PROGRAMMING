package SearchingAlgorithms;

public class min_and_max_element_in_array {
    public static void main(String[] args) {

        int[] myarr = {10,20,60,4,0,80,-800,8,9,7,4,0,6,-9};
        int min = minElement(myarr);
        System.out.println("Min Element in Array: " + min);

        int max = maxElement(myarr);
        System.out.println("Max Element in Array: " + max);
    }

    static int maxElement(int[] myarr) {
        int max = myarr[0];
        for (int n:myarr) {
            if(n>max){
                max = n;
            }
        }
        return max;
    }

    static int minElement(int[] myarr) {
        int min = myarr[0];
        for (int n:myarr) {
            if(n<min){
                min = n;
            }
        }
        return min;
    }
}
