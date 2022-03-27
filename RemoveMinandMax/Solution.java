class Solution {
	public int minimumDeletions(int[] nums) {
		if (nums.length == 1) {
			return 1;
		}
		int lmin = 0;
		int lmax = 0;
		int rmin = nums.length - 1;
		int rmax = nums.length - 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[lmax]) {
				lmax = i;
			}
			if (nums[i] < nums[lmin]) {
				lmin = i;
			}
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] > nums[rmax]) {
				rmax = i;
			}
			if (nums[i] < nums[rmin]) {
				rmin = i;
			}
		}
		int a = (lmin + 1) + (nums.length - rmax);
		int b = (lmax + 1) + (nums.length - rmin);
		int c;
		if (lmin < lmax) {
			c = (lmin + 1) + (lmax - lmin);
		} else {
			c = (lmax + 1) + (lmin - lmax);
		}
		int d;
		if (rmin > rmax) {
			d = (nums.length - rmin) + (rmin - rmax);
		} else {
			d = (nums.length - rmax) + (rmax - rmin);
		}

		return Math.min(Math.min(Math.min(a, b), c), d);
	}
}
