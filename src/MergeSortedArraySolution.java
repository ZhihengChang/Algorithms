public class MergeSortedArraySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos1 = m-1;
        int pos2 = n-1;
        int end = m+n-1;
        if(m==0){
            for(int i=0; i<n; i++){
                nums1[i] = nums2[i];
            }
        }else{
            while(pos2>=0){
                if(nums1[pos1] <= nums2[pos2]){
                    nums1[end] = nums2[pos2];
                    pos2--;
                    end--;
                }
                else if(nums1[pos1] > nums2[pos2]){
                    nums1[end] = nums1[pos1];
                    end--;
                    pos1--;
                    if(pos1<0){
                        nums1[end] = nums2[pos2];
                        break;
                    }
                }

            }
        }
    }



    public static void main(String args[]){
        int[] n1 = {4,5,6,0,0,0};
        int[] n2 = {1,2,3};
        MergeSortedArraySolution msa = new MergeSortedArraySolution();

     }
}
