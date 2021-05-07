public class LongestPalindromicSubstringSolution {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] table = new boolean[len][len];

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                table[i][j] = s.charAt(i) == s.charAt(j);
            }
        }

        String ans = "";
        String result = "";
        int i = 0;
        for(int row = 0; row < len; row++){
            i = row;
            for(int j = 0; j <= row; j++){
                if(table[i][j]){
                    result += s.charAt(i);
                }
                i--;
            }
            if(result.length() > ans.length()){
                ans = result;
            }
            result = "";
        }

        for(int col = 1; col < len; col++){
            i = len - 1;
            for(int k = col; k < len; k++){
                if(table[i][k]){
                    result += s.charAt(k);
                }
                i--;
            }
            if(result.length() > ans.length()){
                ans = result;
            }
            result = "";
        }


        return ans;

    }

    public static void main(String[] args){
        LongestPalindromicSubstringSolution lps = new LongestPalindromicSubstringSolution();
        System.out.println(lps.longestPalindrome("abb"));
    }
}
