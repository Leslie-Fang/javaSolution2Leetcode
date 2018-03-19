class main{
	public static void main(String[] main){
		System.out.println("Hello World!");
		main myMain = new main();
		int[] input=new int[]{1,2,3};
		int res=myMain.maxArea(input);
		System.out.println(res);
	}

    public int maxArea(int[] height) {
    	int res=Math.min(height[0],height[1]);
    	int min=height[0];
    	for(int i=0;i<height.length;i++){
    		min=height[i];
    		for(int j=i+1;j<height.length;j++){
    			res = res<(height[j]<min?height[j]:min)*(j-i)?(height[j]<min?height[j]:min)*(j-i):res;
    		}
    	}
    	return res;
    }
}