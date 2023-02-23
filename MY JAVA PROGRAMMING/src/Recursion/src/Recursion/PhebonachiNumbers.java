package Recursion;

public class PhebonachiNumbers {


    public static void main(String[] args) {

        Nth_PhebonachiSeries(1,0,1,0);
    }

    static void Nth_PhebonachiSeries(int i,int first,int last,int third) {


        System.out.print(third+" ");
        first = last;
        last = third;
        third = first+last;

        if(i == 5){
            System.out.print(third);
            return;
        }
        Nth_PhebonachiSeries(i+1,first,last,third);

    }
}
