public class RelativeSortSolution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int cur = 0;
        for(int number : arr2){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != number){
                    continue;
                }else{
                    swap(arr1, cur, i);
                    cur ++;
                }
            }
        }

        for(int i = cur; i < arr1.length; i++){
            int min = arr1[i];
            int min_index = i;
            for(int j = i + 1; j < arr1.length; j++){
                if(arr1[j] < min){
                    min = arr1[j];
                    min_index = j;
                }
            }
            swap(arr1, i, min_index);
        }
        return arr1;
    }

    private void swap(int[] arr1, int index1, int index2){
        int temp = arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;
    }

    public static void main(String[] args){
        RelativeSortSolution rss = new RelativeSortSolution();
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
//        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
//        int[] arr2 = {2,1,4,3,9,6};
        int[] result = rss.relativeSortArray(arr1, arr2);
        for(int n : result){
            System.out.print(n + " ");
        }
    }
}
