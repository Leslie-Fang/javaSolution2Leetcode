package org.intel.dcg;
import java.util.*;
class Solution {
	List<String> res = new ArrayList<String>();
	String left = "(";
	String right = ")";
    public List<String> generateParenthesis(int n) {
    	if(n != 0){
	    	String subString = "";
	    	int leftNumber = n;
			int rightNumber = n;
	    	tryPut(this.left, subString, leftNumber-1, rightNumber);
	    	tryPut(this.right, subString, leftNumber, rightNumber-1);
    	}
    	return this.res;
    }
    public void tryPut(String put, String subString, int leftNumber, int rightNumber){
    	if(leftNumber > rightNumber || leftNumber < 0){
    		return;
    	}
    	subString += put;
    	if(rightNumber == 0){
    		this.res.add(subString);
    	}else{
    		tryPut(this.left, subString, leftNumber-1, rightNumber);
    		tryPut(this.right, subString, leftNumber, rightNumber-1);
    	}
    	return;
    }
}