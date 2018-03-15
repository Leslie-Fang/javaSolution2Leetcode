class main{
	public static void main(String[] args){
		System.out.println("Hello world!");
		main myMain = new main();
		// myMain.sayHi();
		int[] input = new int[]{2, 7, 11, 15};
		int target = 9;
		int[] res;
		res = myMain.twoSum(input,target);
		for(int item:res){
			System.out.println(item);
		}

	}
	// public void sayHi(){
	// 	System.out.println("Hi!");
	// }
	public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j] == target){
					res[0] = i;
					res[1] = j;
					break;
				}
			}
        }

        return res;
    }
}
