class Solution {
    private int ms = 0;
   // ms=maxSum
    public int maxSumBST(TreeNode root) {
        postOrderTraverse(root);
        return ms;
    }
    private int[] postOrderTraverse(TreeNode root) {
        if (root == null) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0}; 
        int[] left = postOrderTraverse(root.left);
        int[] right = postOrderTraverse(root.right);
       
        if (!(     left != null             
                && right != null            
                && root.val > left[1]       
                && root.val < right[0]))    
            return null;
        int sum = root.val + left[2] + right[2]; 
        ms = Math.max(ms, sum);
        int min = Math.min(root.val, left[0]);
        int max = Math.max(root.val, right[1]);
        return new int[]{min, max, sum};
    }
}