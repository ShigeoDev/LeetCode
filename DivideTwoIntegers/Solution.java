class Solution {
	public int divide(int dividend, int divisor) {
		boolean negative = false;
		if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
			negative = true;
		}
		long num = Long.divideUnsigned(Math.abs((long) dividend), Math.abs((long) divisor));
		if (negative) {
			if (-num < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			return (int) -num;
		} else {
			if (num > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			return (int) num;
		}

	}
}
