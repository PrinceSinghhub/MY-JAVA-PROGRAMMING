package SearchingAlgorithms;

public class Recursive_Binary_Search {
    public static void main(String[] args) {

        int[] myarr = {1,2,3,4,5,6,7,8,9,10};
        int element = 5;

        int start = 0;
        int end = myarr.length-1;

        String res = RecursiveSearch(myarr,element,start,end);
        System.out.println(res);
    }

    static String RecursiveSearch(int[] myarr, int element,int start,int end) {



        int mid = start+(end-start)/2;

        if (start<=end){
            if (myarr[mid]==element){
                return "Element are Found!";
            }
            else if (element>myarr[mid]){
                return RecursiveSearch(myarr,element,mid+1,end);
            }
            else if(element<myarr[mid]){
               return RecursiveSearch(myarr,element,start,mid-1);
            }
        }

        return "Sorry Element are not found";
    }
}
