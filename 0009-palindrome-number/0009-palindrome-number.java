public class Solution {
	public boolean isPalindrome(int x) {
		String stringx = Integer.toString(x);
		char[] charx = stringx.toCharArray();
		if(charx.length%2==0) {
			for(int i = 0; i<charx.length/2; i++) {
				if(charx[i]!=charx[charx.length-1-i]) {
					return false;
				}
			}
		} else if(charx.length%2==1) {
			for(int i = 0; i<(charx.length-1)/2; i++) {
				if(charx[i]!=charx[charx.length-1-i]) {
					return false;
				}
			}
		}
		
		
		return true;
	}
}
