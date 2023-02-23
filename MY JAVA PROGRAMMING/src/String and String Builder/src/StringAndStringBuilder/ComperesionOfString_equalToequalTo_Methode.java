package StringAndStringBuilder;

public class ComperesionOfString_equalToequalTo_Methode {
    public static void main(String[] args) {

        // how to check our object have more then one reference variable using ==
        String name = "coder";
        String name1 = "coder";
        // ther are 2 method to comare 2 strng
        /* 1 == methode (check value with reference variable)
        2 = .equals() methode (check value only not reference variable)
         */
        System.out.println(name==name1);

        String a = new String("coder");
        String b = new String("coder");
        System.out.println(a==b); // false becouse value are same but reference variable are different


    }
}

