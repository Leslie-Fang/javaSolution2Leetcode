 package org.intel.dcg;
 public class Main{
 	public static void main(String[] args){
 		System.out.println("Hello World!");
 		int[] input = new int[]{1,2,1,3}; 
 		int val = 1;
 		NumArray myNumArray = new NumArray(input);
 		System.out.println(myNumArray.sumRange(1,2));
 	}
 }