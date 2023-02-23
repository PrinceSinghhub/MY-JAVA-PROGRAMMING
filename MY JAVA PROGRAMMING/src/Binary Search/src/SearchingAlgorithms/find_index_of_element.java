package SearchingAlgorithms;

public class find_index_of_element {
    public static void main(String[] args) {

        int[] myarr = {2,4,6,9,11,12,14,20,36,48};
        int targetValue = 36;

        int index = FindIndex(myarr,targetValue);
        System.out.println("The Target Value Index is: "+ index);
    }

    static int FindIndex(int[] myarr, int targetValue) {
        int start = 0;
        int end = myarr.length-1;

        /*todo find mid element
         (start+end)/2 may be possiblr this is show error becouse cross the int range of big array size
        thats why  we use start+(end-start)/2
         */

        while(start<=end){
            //find a min element
            int mid = start+(end-start)/2;

            if(targetValue<myarr[mid]){
                end = mid-1;
            }
            if(targetValue>myarr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
