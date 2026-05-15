class Solution {
    public int[] twoSum(int[] nums, int target) {
		int[] solved = new int[2];

		for (int i = 0; i < nums.length; i++) {
			solved[0] = i;
			
			for (int j = i + 1; j < nums.length; j++) {
				solved[1] = j;
				
				if (nums[i] + nums[j] == target) {
					return solved;

				}
				
			}

		}
		return null;
	}
}