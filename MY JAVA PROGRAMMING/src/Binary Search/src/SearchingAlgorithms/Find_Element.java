package SearchingAlgorithms;

public class Find_Element {
    public static void main(String[] args) {

        int[] myarr = {2,4,6,9,11,12,14,20,36,48};
        int targetValue = 400;

        String res = FindElement(myarr,targetValue);
        System.out.println(res);
    }

    static String FindElement(int[] myarr, int targetValue) {
        int start = 0;
        int end = myarr.length-1;

        while (start<=end){

            int mid = start+(end-start)/2;

            if(targetValue>myarr[mid]){
                start = mid+1;
            }
            if(targetValue<myarr[mid]){
                end = mid-1;
            }
            if(targetValue==myarr[mid]){
                return "Element are Found! at Index: "+mid;
            }
        }
        return "Sorry Given Element Are not Found! in Array";
    }
}
