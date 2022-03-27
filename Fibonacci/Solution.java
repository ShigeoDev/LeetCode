class Solution {
	public int fib(int n) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 1;
		if (n == 2 || n == 1) {
			return 1;
		}
		for (int i = 2; i < n; i++) {
			arr[2] = arr[0] + arr[1];
			arr[0] = arr[1];
			arr[1] = arr[2];
		}
		return arr[2];
	}
}
