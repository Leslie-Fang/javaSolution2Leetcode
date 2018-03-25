package org.intel.dcg;
import java.util.*;
class Solution {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> subList = new ArrayList<Integer>();
	int length;
	{
		length = 0;
	}
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	if(root != null){
    		int cSum = 0;
    		DFS(root, sum, cSum);
    	}
    	return this.res;
    }
    public boolean DFS(TreeNode root, int sum, int cSum){
    	boolean isEnd = false;
    	if(root != null){
    		cSum += root.val;
    		this.subList.add(root.val);
    		this.length += 1;
    		if(root.left == null && root.right == null){
    			if(sum == cSum){
    				List<Integer> newList = new ArrayList<>(this.subList);
    				this.res.add(newList);
    			}
    			this.length -= 1;
    			this.subList.remove(length);
    			isEnd = true;
    			return isEnd;
    		}
    		if(!DFS(root.left, sum, cSum)){
    			this.length -= 1;
    			this.subList.remove(length);
    		}
    		if(!DFS(root.right, sum, cSum)){
    			this.length -= 1;
    			this.subList.remove(length);
    		}
    		return isEnd;
    	}
    	return true;
    }

}