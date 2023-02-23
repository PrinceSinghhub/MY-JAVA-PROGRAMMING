package SearchingAlgorithms;

public class Recursive_Binary_Search_Desending_Order {
    public static void main(String[] args) {
        int[] myarr = {10,9,8,7,6,5,4,3,2,1};
        int element = 100;

        int start = 0;
        int end = myarr.length-1;

        String res = RecursiveSearchDesending(myarr,element,start,end);
        System.out.println(res);
    }

    static String RecursiveSearchDesending(int[] myarr, int element,int start,int end) {



        int mid = start+(end-start)/2;

        if (start<=end){
            if (myarr[mid]==element){
                return "Element are Found! at index: " + mid;
            }
            else if (element>myarr[mid]){
                return RecursiveSearchDesending(myarr,element,start,mid-1);
            }
            else if(element<myarr[mid]){
                return RecursiveSearchDesending(myarr,element,mid+1,end);
            }
        }

        return "Sorry Element are not found";
    }
}
