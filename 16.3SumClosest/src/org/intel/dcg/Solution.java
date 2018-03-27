package org.intel.dcg;
import java.util.*;
class Solution {
	int distance;
    public int threeSumClosest(int[] nums, int target) {
    	this.distance = nums[0]+nums[1]+nums[2];
    	for(int i=0;i<nums.length-2;i++){
    		for(int j=i+1;j<nums.length-1;j++){
    			for(int k=j+1;k<nums.length;k++){
					if(Math.abs(nums[i]+nums[j]+nums[k]-target) == 0){
						return target;
					}else if(Math.abs(nums[i]+nums[j]+nums[k]-target)<Math.abs(this.distance-target)){
						this.distance = nums[i]+nums[j]+nums[k];
					}
    			}
    		}
    	}
        return this.distance;
    }
}