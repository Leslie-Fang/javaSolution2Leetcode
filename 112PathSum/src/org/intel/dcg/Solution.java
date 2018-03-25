package org.intel.dcg;
class Solution {
	boolean hasPathSum;
	{
		hasPathSum = false;
	}
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root != null){
    		int cSum = 0;
    		DFS(root,sum,cSum);
    	}
    	return this.hasPathSum;
    }
    public void DFS(TreeNode root, int sum, int cSum){
    	if(root != null){
    		cSum += root.val;
    		if(root.left == null && root.right == null){
    			if(sum == cSum){
    				this.hasPathSum = true;
    			}
    			return;
    		}
    		DFS(root.left, sum, cSum);
    		DFS(root.right, sum, cSum);
    	}
    	return;

    }
}