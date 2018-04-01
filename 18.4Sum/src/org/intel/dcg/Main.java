package org.intel.dcg;
public class Main{
	public static void main(String[] args){
		System.out.println("hello world!");
		Solution mySolution = new Solution();
		int[] input = new int[]{-3,-2,-1,0,0,1,2,3};
		int target = 0;
		System.out.println(mySolution.fourSum(input, target));
	}
}