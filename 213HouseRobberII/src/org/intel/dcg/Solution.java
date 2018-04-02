package org.intel.dcg;
class Solution {
    public int rob(int[] nums) {
    	if(nums.length == 0){
            return 0;
        }
    	return subRob(nums,0,nums.length-1);
        //return 1;
    }
    int subRob(int[] nums,int begin, int end){
    	if(end - begin == 0){
    		return nums[0];
    	}else if(end - begin == 1){
    		return Math.max(nums[0],nums[1]);
    	}
    	return Math.max(subRobL(nums,0,end-begin-1),subRobL(nums,1,end-begin));
    }
    public int subRobL(int[] nums,int begin, int end) {
    	int myLength = end-begin+1;
    	if(myLength == 0){
    		return 0;
    	}else if(myLength == 1){
    		return nums[begin];
    	}else if(myLength == 2){
			return Math.max(nums[begin],nums[begin+1]);
    	}
    	int subsMax = nums[begin];
    	int subMax = Math.max(nums[begin],nums[begin+1]);
    	int cMax;
    	for(int i=begin+2;i<begin+myLength;i++){
			cMax = Math.max(subsMax+nums[i],subMax);
			subsMax = subMax;
			subMax = cMax;
    	}
    	return subMax;
    }
}