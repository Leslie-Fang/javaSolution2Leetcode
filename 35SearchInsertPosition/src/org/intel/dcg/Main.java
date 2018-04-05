 package org.intel.dcg;
 public class Main{
 	public static void main(String[] args){
 		System.out.println("Hello World!");
 		int[] input = new int[]{1,3,5,6}; 
 		int val = 2;
 		Solution mySolution = new Solution();
 		System.out.println(mySolution.searchInsert(input,val));
 	}
 }