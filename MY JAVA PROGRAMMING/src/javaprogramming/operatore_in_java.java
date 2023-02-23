package javaprogramming;

public class operatore_in_java {
    public static void main(String[] args) {
//        todo arthamatic Operation  + * / - % ++ --
        byte a = 50;
        byte b = 100;
        System.out.println(a++);
        System.out.println(b++);
        System.out.println(a);

//        todo assiment operators = += -= *= /= %=
        int x = 30;
        int y = 50;
        x+=y;
        x%=y;
        System.out.println(x);

//todo comparesion operator or relational operator == >= <= > < !=
        int e = 50;
        int f = 100;
        System.out.println(e>f);

//        todo logical operator && || !

        int i = 5;
        int j = 2;
        System.out.println((i>j) && (j<i));

//        todo bitwise opertator | ~ << >> >>> & ^

        int u = 2;
        int r = 1;
        System.out.println(u & r);
        System.out.println(u ^ r);
        System.out.println(~r);
        System.out.println(u>>r);
        System.out.println(u<<r);
    }
}
