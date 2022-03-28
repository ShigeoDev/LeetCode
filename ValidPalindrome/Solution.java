class Solution {
	public boolean isPalindrome(String s) {
		s = s.replace(" ", "");
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		s = s.toUpperCase();
		char[] arr = s.toCharArray();
		char[] narr = new char[arr.length];
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 65 && arr[i] <= 90 || arr[i] >= 48 && arr[i] <= 57) {
				narr[m] = arr[i];
				m++;
			}
		}
		if (narr[0] == 0) {
			return true;
		}
		for (int i = 0, j = narr.length - 1; i < narr.length && j >= 0; i++, j--) {
			while (narr[j] == 0 && j >= 0) {
				j--;
			}
			if (narr[i] != narr[j]) {
				return false;
			}
		}
		return true;
	}
}
