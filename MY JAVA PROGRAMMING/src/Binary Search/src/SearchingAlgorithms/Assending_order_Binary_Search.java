package SearchingAlgorithms;

public class Assending_order_Binary_Search {
    public static void main(String[] args) {

        int[] myarr = {1,2,3,4,5,6,7,8,9,10};
        int element = 1;

        String res = SearchInBinary(myarr,element);
        System.out.println(res);

    }

    static String SearchInBinary(int[] myarr, int element) {

        int start = 0;
        int end = myarr.length-1;

        while (start<=end){

            int mid = start+(end-start)/2;

            if(element>myarr[mid]){
                start = mid+1;
            }
            if(element<myarr[mid]){
                end = mid-1;
            }
            if(element==myarr[mid]){
                return "Element are Found! at Index: "+mid;
            }
        }

        return "Sorry Element are not Found!";

    }
}


