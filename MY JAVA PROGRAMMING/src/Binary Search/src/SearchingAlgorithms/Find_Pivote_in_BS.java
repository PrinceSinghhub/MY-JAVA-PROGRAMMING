package SearchingAlgorithms;

public class Find_Pivote_in_BS {
    public static void main(String[] args) {

        int[] myarr = {4,5,6,7,8,0,1,2};
        int res = FindPivot(myarr);
        System.out.println(res);


    }
    // this will not work in duplicate values
    static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start+(end-start)/2;
            // 4 cases over here

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;

            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            if(arr[start]<=arr[mid]){
                start = mid+1;
            }
        }
        return -1;

    }
}
