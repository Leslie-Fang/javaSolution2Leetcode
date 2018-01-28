public class matrixReshape{
	public matrixReshape(){

	}
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int inputNums=0;
        int[][] result = new int[r][c];
        inputNums = nums.length*nums[0].length;
  //       for(int i=0;i<nums.length;i++){
		// 	for(int j=0;j<nums[i].length;j++){
		// 		inputNums++;
		// 	}
		// }
		// System.out.println(String.format("There are %d numbers",inputNums));
		if(inputNums<r*c){
			return nums;
		}
		int ir=0;
		int ic=0;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				result[i][j] = nums[ir][ic];
				// System.out.println(result[i][j]);
				ic++;
				if(ic>=nums[0].length){
					ic=0;
					ir++;
				}
			}
		}
        return result;
    }
}