package org.intel.dcg;
class Solution {
    public String countAndSay(int n) {
    	String pre = "1";
    	String cur = "";	
    	String res = "";
    	if(n == 1){
    		return "1";
    	}
    	for(int i=2;i<=n;i++){
    		char curChar = pre.charAt(0);
    		int charCount = 1;
    		char lookChar = pre.charAt(0);
    		for(int j=1;j<pre.length();j++){
				lookChar = pre.charAt(j);
    			if(curChar == lookChar){
					charCount +=1;
    			}else{
    				cur = cur +charCount+curChar;
    				charCount = 1;
    				curChar = lookChar;
    			}
    		}
    		cur = cur +charCount+curChar;
    		pre = cur;
    		res = cur;
    		cur = "";
    	}
        return res;
    }
}