public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(isLetter(s.charAt(i))){
                strBuilder.append(s.charAt(i));
            }
        }
        return strBuilder.toString().equalsIgnoreCase(strBuilder.reverse().toString());

    }

    private boolean isLetter(char c){
        return Character.isLetter(c);
    }

    public static void main(String args[]){
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("0P"));
    }
}
