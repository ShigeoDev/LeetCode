import java.util.StringTokenizer;

class Solution {
	public int myAtoi(String s) {
		String[] arr = s.split("");
		boolean num = true;
		boolean sign = false;
		String res = "";
		for (int i = 0; i < arr.length && num; i++) {
			if (arr[i].equals(" ") && !sign) {
				continue;
			}
			if (arr[i].equals("-") && !sign) {
				res = "-";
				sign = true;
				continue;
			}
			if (arr[i].equals("+") && !sign) {
				sign = true;
				continue;
			}
			try {
				Integer.parseInt(arr[i]);
			} catch (Exception e) {
				num = false;
			}
			if (num) {
				res = res + arr[i];
				sign = true;
			}
		}
		if (res.length() == 0 || res.equals("-")) {
			return 0;
		}
		try {
			Integer.parseInt(res);
		} catch (Exception e) {
			if (res.contains("-")) {
				return Integer.MIN_VALUE;
			}
			return Integer.MAX_VALUE;
		}
		return Integer.parseInt(res);
	}
}
