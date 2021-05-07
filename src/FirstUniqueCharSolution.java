import java.util.*;

public class FirstUniqueCharSolution {



    public int firstUniqChar(String s) {
        Hashtable<Character, Integer> table = new Hashtable<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(table.containsKey(cur)){
                count = table.get(cur);
                table.put(cur, ++count);
            }else{
                table.put(cur, 1);
            }
        }

        for(int i=0; i<s.length(); i++){
            if(table.get(s.charAt(i))==1){
                return i;
            }
        }


        return 0;
    }


    public static void main(String args[]){
        FirstUniqueCharSolution uc = new FirstUniqueCharSolution();
//        System.out.println(uc.firstUniqChar("loveleetcode"));
        int[] x = new int[2];
        System.out.println(++x[0]);
    }
}
