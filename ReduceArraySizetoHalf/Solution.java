import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public int minSetSize(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int[] narr = new int[n];
		int m = 0;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				narr[m] = count;
				count = 1;
				m++;
			}
		}
		narr[m] = count;
		Arrays.sort(narr);
		int sum = 0;
		m = narr.length - 1;
		count = 0;
		while (sum < n / 2) {
			sum += narr[m];
			count++;
			m--;
			if (narr[m] == 0) {
				return count;
			}
		}
		return count;
	}
}
