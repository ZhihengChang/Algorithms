public class IsSubsequenceSolution {
    public boolean isSubsequence(String s, String t) {
        if(t.equals(s)) return true;
        if(t.length() < s.length()) return false;

        int pos = 0;
        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);

            for(int j = pos; j < t.length(); j++){
                char tc = t.charAt(j);
                if(sc == tc){
                    pos = j;
                    break;
                }else if(j == t.length() - 1){
                    return false;
                }
            }

            if(i < s.length() - 1 && pos == t.length() - 1) return false;
        }
        return true;
    }

    public static void main(String args[]){
        IsSubsequenceSolution iss = new IsSubsequenceSolution();
        System.out.println(iss.isSubsequence("aaaaaa", "bbaaaa"));
    }
}
