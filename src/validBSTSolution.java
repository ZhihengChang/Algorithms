import java.util.ArrayList;
import java.util.List;

public class validBSTSolution {

     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

     public boolean isValidBST(TreeNode root) {
         return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
     }

     private boolean isValidBST(TreeNode root, int min, int max){
         if(root == null)
             return true;
         if(root.right == null && root.left == null)
             return true;
         if(root.val == min || root.val == max)
             return false;
         if(root.val < min || root.val > max){
             return false;
         }

         return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
     }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<TreeNode> nodeList = new ArrayList<TreeNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        nodeList.add(root);

        do{
            List<Integer> levelList = new ArrayList<Integer>();
            int count = nodeList.size();

            for(int i=0; i<count; i++){
                TreeNode cur = nodeList.remove(i);
                levelList.add(cur.val);
                if(cur.left!=null)
                    nodeList.add(cur.left);
                if(cur.right!=null)
                    nodeList.add(cur.right);
            }

            result.add(levelList);

        }while(!nodeList.isEmpty());

        return result;
    }

     public static void main(String args[]){
         validBSTSolution validBSTSolution = new validBSTSolution();

//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(1);
//         root.right = new TreeNode(15);
//         root.right.right = new TreeNode(20);
//         root.right.left = new TreeNode(6);

         TreeNode root = new TreeNode(3);
         root.left = new TreeNode(9);
         root.right = new TreeNode(20);
         root.right.right = new TreeNode(7);
         root.right.left = new TreeNode(15);

//         System.out.print(validBSTSolution.isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
         System.out.println(validBSTSolution.levelOrder(root).size());
     }
}
