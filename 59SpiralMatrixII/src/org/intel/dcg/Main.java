package org.intel.dcg;
class Main{
	public static void main(String[] args){
		//System.out.println("Hello World!");
		Solution mySolution = new Solution();
		int n =3;
		int[][] res = mySolution.generateMatrix(n);
		if(n == 0){
    		System.out.println(res);
    	}else if(n == 1){
    		System.out.println(res[0][0]);
    	}else{
			for(int i =0;i<res.length;i++){
	    		for(int j=0;j<res.length;j++){
	    			System.out.println(res[i][j]);
	    		}
	    	}
    	}
	}
}