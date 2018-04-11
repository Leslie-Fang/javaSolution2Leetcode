package org.intel.dcg;
class Solution {
    public int[] plusOne(int[] digits) {
        //int[] res = new int[]{};
        int length = digits.length;
        int[] res =digits;
        for(int i=length-1;i>=0;i--){
        	if(digits[i]<9){
        		digits[i] +=1;
        		res = digits;
        		break;
        	}else{
        		digits[i] = 0;
        		if(i == 0){
        			res = new int[length+1];
        			res[0] = 1;
        			break;
        		}
        	}
        }
        return res;
    }
}