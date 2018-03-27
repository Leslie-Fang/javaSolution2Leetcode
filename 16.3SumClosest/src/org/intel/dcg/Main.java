package org.intel.dcg;
class Main{
	public static void main(String[] args){
		//System.out.println("Hello World!");
		Solution mySolution = new Solution();
		int[] input = new int[]{-1, 2, 1, -4};
		int target = 1;
		System.out.println(mySolution.threeSumClosest(input, target));
	}
}