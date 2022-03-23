class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		if (x < 10)
			return true;
		String[] str = Integer.toString(x).split("");
		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals(str[(str.length - 1 - i)])) {
				return false;
			}
		}
		return true;
	}
}
