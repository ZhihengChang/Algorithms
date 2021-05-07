public class MaxNestingDepthParenthesesSolution {
    public int maxDepth(String s) {
        int max = 0;
        int depth = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                depth++;
                max = Math.max(max, depth);
            }else if(s.charAt(i) == ')'){
                depth--;
            }
        }
        return max;
    }
}
