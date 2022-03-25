class Solution {
	public int mySqrt(int x) {
		long n = 1;
		long m = x;
		while (n * n < m + 1) {
			n++;
		}
		return (int) (n - 1);
	}
}
