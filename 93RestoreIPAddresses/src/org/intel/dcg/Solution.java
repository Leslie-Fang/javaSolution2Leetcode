package org.intel.dcg;
import java.util.*;
class Solution {
    public List<String> restoreIpAddresses(String s) {
    	List<String> myList = new ArrayList<>();
    	int dotCount = 0;
        if(s.length() == 0){
    		return myList;
    	}
    	DFS(s,0,"","",myList,0);
    	return myList;
    }
    public void DFS(String s, int dotCount, String currentString, String dotString, List<String> myList, int cIndex){
    	currentString = currentString + s.charAt(cIndex);
    	dotString = dotString + s.charAt(cIndex);
    	if(cIndex == s.length()-1){
    		if(Integer.parseInt(dotString) < 256 && dotCount == 3){
    			// System.out.println(currentString);
    			// String[] subStrings = currentString.split("."); 
    			// System.out.println(subStrings[0]);
    			for(String subString: currentString.split("\\.")){
            		if(subString.length()>1 && subString.startsWith("0")){
            			return;
            		}
        		}
    			myList.add(currentString);
    			return;
    		}else{
    			return;
    		}
    	}else if(Integer.parseInt(dotString) < 256){
    		if(dotCount < 3){
				DFS(s,dotCount+1,currentString+".","",myList,cIndex+1);
				DFS(s,dotCount,currentString,dotString,myList,cIndex+1);
    		}else{
				cIndex = cIndex + 1;
				DFS(s,dotCount,currentString,dotString,myList,cIndex);
				return;
    		}
    	}else{
    		return;
    	}

    }
}