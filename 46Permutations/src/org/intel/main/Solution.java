package org.intel.dcg;
import java.util.*;
class Solution {
	ArrayList<List<Integer>> myList = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        permute(this.myList, nums, 0);
        return this.myList;
    }
    public void permute(List<List<Integer>> result, int[] array, int start) {
		if (start >= array.length) {
			List<Integer> current = new ArrayList<Integer>();
			for (int a : array) {
			    current.add(a);
			}
			result.add(current);
		} else {
			for (int i=start; i<array.length; i++) {
				swap(array, start, i);
				permute(result, array, start+1);
				swap(array, start, i);
			}
		}
	}
	
	public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}