package SearchingAlgorithms;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {

        // in this we dont know our array array assesnding or desending fist check assesnding or desending
//        int[] myarr = {10,9,8,7,6,5,4,3,2,1};
        int[] myarr = {1,2,3,4,5,6,7,8,9,10};
        int element = 20;

        String res = SearchInBinary(myarr,element);
        System.out.println(res);
    }

    static String SearchInBinary(int[] myarr, int element) {

//        todo for assending
        if(myarr[0]<myarr[myarr.length-1]){
            // means array are assending order
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

        }
//        todo for desending
        if(myarr[0]>myarr[myarr.length-1]){
            // means array are dessending order
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
        }

        return "Sorry Given Element Are not Found! in Array";

    }
}
