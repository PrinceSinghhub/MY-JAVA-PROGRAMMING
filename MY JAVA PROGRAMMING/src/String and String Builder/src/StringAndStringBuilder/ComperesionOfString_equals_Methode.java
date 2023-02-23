package StringAndStringBuilder;

public class ComperesionOfString_equals_Methode {
    public static void main(String[] args) {

        // how to check our object have more then one reference variable using .equals() methode
        String name = "coder";
        String name1 = "coder";


        // .equals() methode only check value not reference variable
        System.out.println(name.equals(name1));

        String a = new String("coder");
        String b = new String("coder");
        System.out.println(a.equals(b)); // true becouse .equals() methode only check value not reference variable
    }
}
