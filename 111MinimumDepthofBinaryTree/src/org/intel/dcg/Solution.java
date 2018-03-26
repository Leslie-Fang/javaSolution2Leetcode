package org.intel.dcg;
import java.util.*;
class Solution {
	int shortLength;
	Queue<TreeNode> res = new LinkedList<TreeNode>();
	{
		shortLength = 0;
	}
    public int minDepth(TreeNode root) {
    	if(root != null){
			res.offer(root);
			while(!res.isEmpty()){
				this.shortLength += 1;
				int levelSize = res.size();
				for(int i=0;i<levelSize;i++){
					if(res.peek().left == null && res.peek().right == null){
						return this.shortLength;
					}else{
						if(res.peek().left != null)res.offer(res.peek().left);
						if(res.peek().right != null)res.offer(res.peek().right);
						res.poll();
					}
				}
			}
    	}
        return this.shortLength;
    }
}