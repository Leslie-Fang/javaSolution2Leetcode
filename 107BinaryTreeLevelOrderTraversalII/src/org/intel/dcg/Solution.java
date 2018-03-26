package org.intel.dcg;
import java.util.*;
class Solution {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	if(root != null){
    		queue.offer(root);
    		while(!queue.isEmpty()){
    			ArrayList<Integer> subRes = new ArrayList<Integer>();
    			int levelSize = queue.size();
    			for(int i=0;i<levelSize;i++){
    				if(queue.peek().left != null)queue.offer(queue.peek().left);
    				if(queue.peek().right != null)queue.offer(queue.peek().right);
		    		subRes.add(queue.poll().val);
    			}
    			res.add(0,subRes);
    		}

    	}
        return this.res;
    }
}