 package org.intel.dcg;
class Solution {
    public int removeElement(int[] nums, int val) {
    	int point = 0;
    	for(int i:nums){
    		if(i!=val){
    			nums[point] = i;
    			point +=1;
    		}
    	}
    	return point;   
    }
}