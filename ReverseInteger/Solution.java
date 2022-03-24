class Solution {
	public int reverse(int x) {
		String number = Integer.toString(x);
		String[] arr = number.split("");
		number = "";
		boolean negative = false;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].equals("-")) {
				negative = true;
			} else
				number = number + arr[i];
		}
		if (Long.parseLong(number) > Integer.MAX_VALUE) {
			return 0;
		}
		if (negative) {
			return 0 - Integer.parseInt(number);
		}
		return Integer.parseInt(number);

	}
}
