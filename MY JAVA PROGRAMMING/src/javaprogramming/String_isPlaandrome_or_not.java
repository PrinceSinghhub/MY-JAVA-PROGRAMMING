package javaprogramming;

public class String_isPlaandrome_or_not {
    public static void main(String[] args) {

        String name = "maa";

        String res = palandrome(name);
        System.out.println(res);
    }


    static String palandrome(String name) {

            if(name == null || name.length()==0){
               return "String are a palandrome";
            }

            int i = 0;
            int j = name.length()-1;
            while (i<=j){
                char start = name.charAt(i);
                char end = name.charAt(j);
                if (start == end) {
                    i++;
                    j--;
                }else {
                    return "String are not a palandrome";
                }
            }
            return "String are palandrome";
            }
}


