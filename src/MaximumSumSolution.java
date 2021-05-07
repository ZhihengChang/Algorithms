public class MaximumSumSolution {
    public int maximumSum(int[] arr) {
        int result = 0, sum = 0, max = arr[0], min = arr[0];

        for (int num : arr) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        if (max == min && min < 0) {
            return max;
        }


        result = sum - min;
        if (result < max) {
            return max;
        }


        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, -2, -5, -2};
        MaximumSumSolution mss = new MaximumSumSolution();
        System.out.println(mss.maximumSum(arr));
    }
}