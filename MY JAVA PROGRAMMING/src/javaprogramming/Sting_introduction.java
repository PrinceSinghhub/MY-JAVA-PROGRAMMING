package javaprogramming;

public class Sting_introduction {
    public static void main(String[] args) {

        String Str = "Codex Coder";

        int a = Str.length();
        String b = Str.toLowerCase();
        String c = Str.toUpperCase();
        String d = Str.trim();
        String e = Str.substring(1,7);
        String f = Str.replace('d','p');
        boolean g = Str.startsWith("A");
        boolean h = Str.endsWith("r");
        char i = Str.charAt(3);

        int k = Str.indexOf("d",2);

        String Str2 = "Codex Coder";
        boolean l = Str.equals(Str2);

        String m = "CODEX CODER";
        boolean n = Str.equalsIgnoreCase(m);

        boolean o = Str.contains("o");

        String Str1 = "Codex Coder";
        for(String s: Str1.split("d") ){
            System.out.print(s);
        }


    }
}
