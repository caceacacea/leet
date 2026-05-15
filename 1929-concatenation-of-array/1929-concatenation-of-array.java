class Solution {
    public int[] getConcatenation(int[] nums) {
		int[] concatenation = new int[nums.length*2]; // nums 길이 2배 배열
		
		for (int i = 0; i < concatenation.length; i++) {
			concatenation[i] = nums[i % nums.length]; //개쩌는 magicass 알고리즘
		}
		
		return concatenation;
	}
}