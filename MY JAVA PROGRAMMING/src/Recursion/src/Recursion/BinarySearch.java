package Recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int[] myarr = {1,2,6,9,10,15,18};
        int res = RecursionBS(myarr,15,0, myarr.length-1);
        System.out.println(res);
    }

    static int RecursionBS(int[] myarr,int target,int start,int end) {

        int mid = start + (end-start)/2;

        if(start>end){
            return -1;
        }

        if(target==myarr[mid]){
            return mid;
        }
        if(target>myarr[mid]){
            return RecursionBS(myarr,target,mid+1,end);
        }

        return RecursionBS(myarr,target,start,mid-1);

    }
}
