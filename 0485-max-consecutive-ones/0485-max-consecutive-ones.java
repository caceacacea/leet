class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
		int curConse = 0,maxConse = 0;
        
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				curConse++; // 1일때 현재에다 1씩 더하기
				if (maxConse <= curConse) { // 클때만 1 더하기
					maxConse = curConse;
				}
				
			} else {
				curConse = 0; // 0이면 초기화
			}
			
		}
		
		return maxConse;
    }
}