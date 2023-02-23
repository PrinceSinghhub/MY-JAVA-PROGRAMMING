package StringAndStringBuilder;

import java.util.ArrayList;

public class Operators_In_String {
    public static void main(String[] args) {

        System.out.println((char)(100));

        // becouse + operator requresd at lest 1 string now work other wise not work
        String sr  = new Integer(50) + " " +  new ArrayList<>();
        System.out.println(sr);

        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println("a"+1); // usong toString method convert
        System.out.println("a"+"1");// direct concatinate




    }
}
