 package org.intel.dcg;
 import java.util.*;
 class Solution{
    public int searchInsert(int[] nums, int target) {
		if(nums.length == 0){
    		return 0;
    	}
    	for(int i=0;i<nums.length;i++){
    		if(target > nums[i]){
    			continue;
    		}else{
    			return i;
    		}
    	}
    	return nums.length;   
    }
 }