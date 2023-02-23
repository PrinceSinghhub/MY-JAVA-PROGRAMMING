package SearchingAlgorithms;

public class Search_in_2D_Array {
    public static void main(String[] args) {

        int[][] myarr = {{1,2,3},
                         {4,5,6,7},
                         {8,9,10}};
        int data = 70;
        SearchIn2dArray(myarr,data);
    }

    static void SearchIn2dArray(int[][] myarr, int data) {
        int c = 0;
        for (int i = 0; i < myarr.length; i++) {
            for (int j = 0; j < myarr[i].length; j++) {
                if(myarr[i][j]==data){
                    c++;
                    System.out.println("Element are Found!");
                }
            }
        }
        if (c == 0) {
            System.out.println("Sorry element are not Found!");
        }
    }
}
