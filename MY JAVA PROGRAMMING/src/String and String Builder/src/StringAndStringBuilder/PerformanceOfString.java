package StringAndStringBuilder;

public class PerformanceOfString {
    public static void main(String[] args) {

        String add = "";
        for (int i = 0; i < 26; i++) {
            char ans = (char)('a'+i);
            add+=ans;
            // every time with i create a new object
        }
        System.out.println(add);// not a good way to print data time O(n^2)
    }
}
