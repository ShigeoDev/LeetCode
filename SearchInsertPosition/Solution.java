class Solution {
	public int searchInsert(int[] nums, int target) {

		int len = nums.length;
		if (target <= nums[0])
			return 0;
		if (target > nums[len - 1])
			return len;
		int l = 0;
		int r = len - 1;
		if (r - l == 1 && target > nums[l])
			return r;
		while (l + 1 < r) {
			int c = l + (r - l) / 2;

			if (nums[c] == target)
				return c;

			else if (target > nums[c]) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
}
