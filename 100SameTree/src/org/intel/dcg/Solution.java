package org.intel.dcg;
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	boolean[] res = new boolean[]{true};
    	if(p==null && q==null){
    		return true;
    	}
    	if(p !=null && q!=null){
	    	DFS(p,q,res);
	    	return res[0];
    	}else{
    		return false;
    	}
    }
    public void DFS(TreeNode p, TreeNode q, boolean[] res){
    	if(p.val == q.val){
    		if(p.left == null && q.left !=null){
    			res[0] = false;
    			return;
    		}
    		if(p.left != null && q.left ==null){
    			res[0] = false;
    			return;
    		}
    		if(p.right == null && q.right !=null){
    			res[0] = false;
    			return;
    		}
    		if(p.right != null && q.right ==null){
    			res[0] = false;
    			return;
    		}
    		if(p.left != null && q.left !=null){
				DFS(p.left,q.left,res);
    		}
    		if(p.right != null && q.right !=null){
				DFS(p.right,q.right,res);
    		}

    	}else{
    		res[0] = false;
    	}
    	return;
    }
}