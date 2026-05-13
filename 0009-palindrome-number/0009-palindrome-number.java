class Solution {
    public boolean isPalindrome(int x) {
        String isPal = x+"";
		
		boolean isP = true;
		
		for (int i = 0; i <=  isPal.length()/2; i++) {
			if (isPal.charAt(i) == isPal.charAt(isPal.length() - i - 1)) {
			} else {
				isP = false;
			}
		}
		
		return isP;
    }
}