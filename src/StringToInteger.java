public class StringToInteger {

        public int myAtoi(String str) {
            int negSign = 1;
            int number = 0;

            str = str.trim();
            System.out.println(str);
            if(Character.isLetter(str.charAt(0)))
                return 0;

            if(str.charAt(0) == '-'){
                negSign = -1;
            }

            for(int i=0; i<str.length(); i++){
                int cur = str.charAt(i) - 48;
                if(number == 0 && cur == 0){
                    continue;
                }else if(cur >=0 || cur<=9){
                    if(negSign == -1){
                        if(number > Integer.MAX_VALUE/10
                                || (number == Integer.MAX_VALUE/10 && cur > 8)){
                            return Integer.MIN_VALUE;
                        }
                    }else{
                        if(number > Integer.MAX_VALUE/10
                                || (number == Integer.MAX_VALUE/10 && cur > 7)){
                            return Integer.MAX_VALUE;
                        }
                    }
                    number = number * 10 + cur;

                }else{
                    break;
                }

            }



            return number * negSign;
        }

        public static void main(String args[]){
            StringToInteger sti = new StringToInteger();
            System.out.println(sti.myAtoi("   -42"));
        }


}
