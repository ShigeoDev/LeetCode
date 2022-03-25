class Solution {
	public String addBinary(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		int carry = 0;
		int maxlen = Math.max(len1, len2);
		boolean n = true;
		boolean m = true;
		String res = "";
		int value;
		int p;
		int q;
		for (int i = 0; i < maxlen; i++) {
			try {
				Character.getNumericValue(a.charAt(len1 - 1 - i));
			} catch (Exception e) {
				n = false;
			}
			if (n) {
				p = Character.getNumericValue(a.charAt(len1 - 1 - i));
			} else {
				p = 0;
			}
			try {
				Character.getNumericValue(b.charAt(len2 - 1 - i));
			} catch (Exception e) {
				m = false;
			}
			if (m) {
				q = Character.getNumericValue(b.charAt(len2 - 1 - i));

			} else {
				q = 0;
			}
			value = p + q + carry;
			System.out.println(q);
			System.out.println(p);
			System.out.println(carry);
			System.out.println(value);
			System.out.println();

			if (value > 1) {
				value = value - 2;
				carry = 1;
			} else {
				carry = 0;
			}
			res = value + res;
		}
		if (carry == 1) {
			res = "1" + res;
		}
		return res;
	}
}
