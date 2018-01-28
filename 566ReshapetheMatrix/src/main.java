public class main{
	public static void main(String[] args){
		System.out.println("Test Begin!");
		int[][] input={{1,2},{3,4}};
		int r=1;
		int c=4;
		// System.out.println(input.length);
		// System.out.println(input[0].length);
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[i].length;j++){
				System.out.println(input[i][j]);
			}
		}
		int[][] result=new matrixReshape().matrixReshape(input,r,c);
		System.out.println("Test End!");
		for(int i=0;i<result.length;i++){
			for(int j=0;j<result[i].length;j++){
				System.out.println(result[i][j]);
			}
		}
	}
}
