package StringAndStringBuilder;


public class String_Builder {
    public static void main(String[] args) {
        // same work like list in python
        StringBuilder add =  new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ans = (char)('a'+i);
//            methods are also same like python list
            add.append(ans);


        }
        System.out.println(add);

    }
}
