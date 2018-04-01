package org.intel.dcg;
import java.util.*;
class Solution {
	HashSet resSet = new HashSet();
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	int inputLength = nums.length;
    	Arrays.sort(nums);
    	if(inputLength>=4){
    		for(int i=0;i<inputLength;i++){
    			for(int j=i+1;j<inputLength;j++){
    				for(int k=j+1;k<inputLength;k++){
    					for(int h=k+1;h<inputLength;h++){
    						if(nums[i]+nums[j]+nums[k]+nums[h] == target){
    							//System.out.println("yes");
    							ArrayList<Integer> subArrayList = new ArrayList<Integer>();
    							subArrayList.add(nums[i]);
    							subArrayList.add(nums[j]);
    							subArrayList.add(nums[k]);
    							subArrayList.add(nums[h]);
    							resSet.add(subArrayList);
    							//res.add(subArrayList);
    						}
    					}
    				}
    			}
    		}
    	}
    	ArrayList<List<Integer>> res = new ArrayList<List<Integer>>(resSet);
        return res;
    }
}