package SearchingAlgorithms;

public class Serach_under_the_index_RANGE {
    public static void main(String[] args) {

        int[] myarr = {10,20,60,4,0,80,800,8,9,7,4,0,6};
        int s = 2;
        int e = 5;
        int data = 800;

        boolean res = SearchInRange(myarr,s,e,data);
        System.out.println(res);
    }

    static boolean SearchInRange(int[] myarr, int s, int e,int data) {
        for (int i = s; i <e ; i++) {
            if(myarr[i]==data){
                return true;
            }
        }
        return false;
    }
}
