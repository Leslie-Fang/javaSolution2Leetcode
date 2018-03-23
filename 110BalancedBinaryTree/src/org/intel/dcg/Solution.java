package org.intel.dcg;
import java.util.*;
import java.lang.Math;
class Solution {
	boolean flag;
	{
		flag=true;
	}
    public boolean isBalanced(TreeNode root) {
    	int deep = 0;
    	if(root != null){
    		DFS(root, deep);
    	}
        return this.flag;
    }
    public int DFS(TreeNode root, int deep){
    	if(root == null){
    		return deep;
    	}
    	deep = deep + 1;
    	if(root.left == null && root.right == null){
    		return deep;
    	}else{
    		int leftDeep,rightDeep;
    		leftDeep = DFS(root.left, deep);
    		rightDeep = DFS(root.right, deep);
    		if(Math.abs(leftDeep-rightDeep) > 1){
    			this.flag = false;
	    	}
	    	deep = Math.max(leftDeep,rightDeep);
	    	return deep;
    	}
    }
}