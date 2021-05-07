import java.util.*;
public class IntersectionOfTwoArraySolution {
    private ArrayList<Integer> toArrayList(int[] input){
        ArrayList<Integer> result = new ArrayList<>();
        for(int n : input){
            result.add(n);
        }
        return result;
    }
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        if(nums1.length>nums2.length){
            large = toArrayList(nums1);
            small = toArrayList(nums2);
        }else{
            large = toArrayList(nums2);
            small = toArrayList(nums1);
        }

        for(int i=0; i<large.size(); i++){
            for(int j=0; j<small.size(); j++){
                System.out.println("large.get("+i+")="+large.get(i));
                System.out.println("small.get("+j+")="+small.get(j));

                if(large.get(i).equals(small.get(j))){
                    list.add(large.get(i));
                    small.remove(j);
                    break;
                }
            }
        }

        /*
        boolean[][] table = new boolean[large.length][small.length];
        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++){
                table[i][j] = large[i]==small[j];
            }
        }



        for(int i=0; i<large.length; i++){
            for(int j=0; j<small.length; j++){
                if(table[i][j]){
                    list.add(large[i]);
                    if(i<table.length-1)
                        i++;
                }
            }
        }*/


        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }


        return result;
    }

    public static void main(String[] args){
        //IntersectionOfTwoArraySolution s = new IntersectionOfTwoArraySolution();

        //int[] nums1 = {-200,1,2,3};
        //int[] nums2 = {1,-200,-200};
        //[-2147483648,1,2,3]
        //[1,-2147483648,-2147483648]
        //char c='1';
        //int a=Integer.parseInt(String.valueOf(c));
        //System.out.println(c=='.');
        //System.out.println(s.intersect(nums1, nums2).length);

        int[][] board = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        int[] box = new int[9];
        int pos = 0;
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                box[pos] = board[row][col];
                pos++;
            }
        }

        for(int i : box){
            System.out.print(i+" ");
        }


    }
}
