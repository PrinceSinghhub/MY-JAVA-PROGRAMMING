package javaprogramming;
public class string_in_java {
    public static void main(String args[]){
        String pr = "hello I Am CODEX CODER\nI am Learn Java";
        System.out.println(pr);
        System.out.println(pr.replace("CODEX","CODER BABA"));
//        todo reverse string
        pr = new StringBuffer(pr).reverse().toString();
        System.out.println(pr);
    }
}
