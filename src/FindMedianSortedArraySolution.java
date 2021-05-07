public class FindMedianSortedArraySolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //if nums1 || nums2 is empty
        // return nums1 || nums2 median

        //[3,4] [1,2]
        //if nums2[0] > nums1[last] || nums2[last] < nums1[0]
        int m = nums1.length, n = nums2.length;

        int[] merged = new int[m + n];

        int pos = 0;
        int pointer1 = 0, pointer2 = 0;
        while(pointer1 < m && pointer2 < n){
            if(nums1[pointer1] < nums2[pointer2]){
                merged[pos] = nums1[pointer1];
                pointer1 ++;
            }else{
                merged[pos] = nums2[pointer2];
                pointer2 ++;
            }
            pos++;
        }
        if(pointer1 >= m){
            for(; pointer2 < n; pointer2++){
                merged[pos] = nums2[pointer2];
            }
        }else{
            for(; pointer1 < m; pointer1++){
                merged[pos] = nums1[pointer1];
            }
        }

        if((m + n) % 2 == 0){
            return (merged[(m + n) / 2] + merged[(m + n) / 2 - 1]) / 2.0;
        }
        return merged[merged.length/2];
    }

    public static void main(String[] args){
        FindMedianSortedArraySolution msa = new FindMedianSortedArraySolution();
        System.out.println(msa.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
