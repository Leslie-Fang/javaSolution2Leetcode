package org.intel.dcg;
class Solution {
    public String longestPalindrome(String s) {
    	if(s == "" || s.length() == 1){
    		
    		return s;
    	}
    	String subString = s;
    	int totalLength = s.length();
    	int currentlength = s.length();
        while(currentlength > 0){
        	for(int i =0;i<totalLength-currentlength+1;i++){
        		if(isPalindrome(s.substring(i,i+currentlength))){
        			return s.substring(i,i+currentlength);
        		}
        	}
        	currentlength -= 1;
        }
        return "";
    }
    boolean isPalindrome(String s){
    	int start = 0;
    	int end = s.length()-1;
    	while(start<end){
    		if(s.charAt(start) != s.charAt(end)){
    			return false;
    		}else{
    			start +=1;
    			end -=1;
    		}
    	}
    	return true;
    }
}