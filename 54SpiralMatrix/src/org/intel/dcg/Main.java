package org.intel.dcg;
class Main{
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Solution mySolution = new Solution();
		//int[][] matrix = new int[][]{ {1, 2, 3 },{4, 5, 6 },{7, 8, 9} };
		//int[][] matrix = new int[][]{{2,5,8},{4,0,-1}};
		int[][] matrix = new int[][]{{1, 2, 3, 4 },{5, 6, 7, 8 },{9,10,11,12},{13,14,15,16} };
		System.out.println(mySolution.spiralOrder(matrix));
	}
}