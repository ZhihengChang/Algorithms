public class ReverseIntegerSolution {
    public int reverse(int x) {

        //boolean isNegative = false;
        //if(x < 0) {
           // isNegative = true;
            //x = x * (-1);
        //}

        int result = 0;
        int lastDigit = 0;

        while (x != 0) {
            lastDigit = x % 10;

            if(result > (Integer.MAX_VALUE/10)
                    || ((result == Integer.MAX_VALUE/10) && (lastDigit > 7)))
                return 0;
            if(result < (Integer.MIN_VALUE/10)
                    || ((result == Integer.MIN_VALUE/10) && (lastDigit < -8)))
                return 0;

            result = result * 10 + lastDigit;
            x /= 10;

        }

        return result;
    }

    public static void main(String args[]){
        ReverseIntegerSolution ris = new ReverseIntegerSolution();
        System.out.print(ris.reverse(-1534236469));
    }
}
