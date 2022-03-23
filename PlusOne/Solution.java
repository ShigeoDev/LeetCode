class Solution {
	public int[] plusOne(int[] digits) {
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + carry;
			digits[i] = sum % 10;
			carry = sum / 10;
		}
		if (carry == 1) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			for (int i = 0; i < digits.length; i++) {
				newDigits[i + 1] = digits[i];
			}
			return newDigits;
		}
		return digits;
	}
}
