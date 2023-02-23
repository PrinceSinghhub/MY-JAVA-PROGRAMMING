package SearchingAlgorithms;

public class Desending_Order_Binary_Search {
    public static void main(String[] args) {

        int[] myarr = {10,9,8,7,6,5,4,3,2,1};
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
                end = mid-1;
            }
            if(element<myarr[mid]){
                start = mid+1;
            }
            if(element==myarr[mid]){
                return "Element are Found! at Index: "+mid;
            }
        }

        return "sorry";

    }
}

