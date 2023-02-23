package SearchingAlgorithms;

public class Find_Pivot_in_Dublicate_element_in_BS {
    public static void main(String[] args) {
        int[] myarr = {2,2,9,2,2,2};
        int res = FindPivotDublicateBS(myarr);
        System.out.println(res);


    }
    // this will work for duplicate values
    static int FindPivotDublicateBS(int[] arr){
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

            // if elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid] == arr[end]){

                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                // check whether end is pivot
                if(arr[end]<arr[end-1]){
                   return end-1;
                }
                end--;
            }
            // #left side is sorted, so pivot should be in right

            if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;

    }
}
