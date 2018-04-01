package org.intel.dcg;
import java.util.*;
class Solution{
	LinkedList<TreeNode> cQueue = new LinkedList<TreeNode>();
	LinkedList<TreeNode> subQueue;
	public int findBottomLeftValue(TreeNode root) {
		cQueue.add(root);
		System.out.println(root);
		while(cQueue.size() > 0){
			subQueue = new LinkedList<TreeNode>(cQueue);
			int length = cQueue.size();
			for(int i=0;i<length;i++){
				if(cQueue.peek().left != null){
					cQueue.add(cQueue.peek().left);
				}
				if(cQueue.peek().right != null){
					cQueue.add(cQueue.peek().right);
				}
				cQueue.pop();
			}
		}
		return subQueue.peek().val;	
    }
}