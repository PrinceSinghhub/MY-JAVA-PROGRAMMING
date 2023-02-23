package SearchingAlgorithms;

public class finf_char_in_String {
    public static void main(String[] args) {

        String name = "Codex Coder";
        char find = 'z';
        boolean res  = findChar(name,find);
        System.out.println(res);
    }

    static boolean findChar(String name,char find) {

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == find){
                return true;
            }
        }
        return false;
    }
}
