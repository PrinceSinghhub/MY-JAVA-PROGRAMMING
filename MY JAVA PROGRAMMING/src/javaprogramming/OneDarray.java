package javaprogramming;

public class OneDarray {
    public static void main(String args[]) {
        int myarr[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                //"Row: " + i + " Collom: " + j + " = " +
                System.out.print(myarr[i][j]+" ");
                System.out.print(myarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
