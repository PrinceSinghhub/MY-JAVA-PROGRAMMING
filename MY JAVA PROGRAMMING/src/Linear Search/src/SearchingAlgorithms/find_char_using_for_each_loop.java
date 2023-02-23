package SearchingAlgorithms;

import java.util.Arrays;

public class find_char_using_for_each_loop {
    public static void main(String[] args) {
        String name = "Codex Coder";
        char find = 'C';
        boolean res  = findChar(name,find);
        System.out.println(res);
//        todo for array
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean findChar(String name,char find) {
       for(char c: name.toCharArray()){
           if(c==find){
               return true;
           }
       }
       return false;
    }
}
