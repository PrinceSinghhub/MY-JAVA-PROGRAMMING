package JavaQuestion;
public class max_element_in_array {
    public static void main(String[] args) {

        int[] myarr = {-22,-1,-100,0,10};
        maxelement(myarr);
    }

    static void maxelement(int[] myarr) {
//        System.out.println(Arrays.stream(myarr).max());
        int max = myarr[0];
        for (int i = 0; i < myarr.length; i++) {
            if(myarr[i]>=max){
                max = myarr[i];
            }
        }

        System.out.println(max);
    }
}
