public class CountAndSaySolution {
    public String countAndSay(int n) {
        if(n<=1){
            return "1";
        }else{
            String result = "";
            String pre = countAndSay(n-1);
            char cur = pre.charAt(0);
            int counter = 1;
            boolean isSame = false;
            if(pre.length() == 1){
                return String.valueOf(counter) + cur;
            }
            for(int i=1; i<pre.length(); i++){
                char next = pre.charAt(i);
                if(cur == next){
                    counter++;
                    isSame = true;
                }else{
                    result += String.valueOf(counter) + cur;
                    cur = next;
                    counter = 1;
                    isSame = false;
                }
                if(i == pre.length()-1){
                    result += String.valueOf(counter) + cur;
                    break;
                }

            }
            return result;
        }
    }

    public static void main(String args[]){
        CountAndSaySolution cas = new CountAndSaySolution();
        System.out.println(cas.countAndSay(6));
    }
}
