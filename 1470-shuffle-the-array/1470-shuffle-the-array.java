class Solution {
    public int[] shuffle(int[] nums, int n) {
		int[] solved = new int[nums.length];
			
		for (int i = 0; i < n; i++) { // 짝수번마다 nums[i] 넣기
			solved[i*2] = nums[i]; 
		}
		
		for (int i = 0; i < n; i++) { // 홀수번마다 nums[i+n] 넣기
			solved[i*2+1] = nums[i+n];
		}
		
		return solved;
	}
}