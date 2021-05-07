public class subtractProductAndSumSolution {
    public int subtractProductAndSum(int n) {

        int number = n;
        int[] digit = new int[String.valueOf(n).length()];
        int index = 0;
        while (number > 0) {
            digit[index] = number % 10;
            number /= 10;
        }

        int sum = 0;
        int product = 1;
        for(int i = 0; i < digit.length; i++){
            sum += digit[i];
            product *= digit[i];
        }
        return product - sum;
    }

    public static void main(String args[]){
        subtractProductAndSumSolution sps = new subtractProductAndSumSolution();
        System .out.print(sps.subtractProductAndSum(235));
    }
}
