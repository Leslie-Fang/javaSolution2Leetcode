 package org.intel.dcg;
 class Solution {
    public int rob(int[] nums) {
    	int myLength = nums.length;
    	if(myLength == 0){
    		return 0;
    	}else if(myLength == 1){
    		return nums[0];
    	}else if(myLength == 2){
			return Math.max(nums[0],nums[1]);
    	}
    	int subsMax = nums[0];
    	int subMax = Math.max(nums[0],nums[1]);
    	int cMax;
    	for(int i=2;i<myLength;i++){
			cMax = Math.max(subsMax+nums[i],subMax);
			subsMax = subMax;
			subMax = cMax;
    	}
    	return subMax;

        //return maxM(nums, nums.length-1);
    }
    // int maxM(int[] nums, int end){
    // 	if(end == -1){
    // 		return 0;
    // 	}else if(end == 0){
    // 		return nums[0];
    // 	}else if(nums.length == 1){
    // 		return Math.max(nums[0],nums[1]);
    // 	}else{
    // 		return Math.max(maxM(nums, end-2)+nums[end],maxM(nums, end-1));
    // 	}
    // }
}