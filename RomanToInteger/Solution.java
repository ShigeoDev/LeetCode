class Solution {
	public int romanToInt(String s) {
		String[] arr = s.split("");
		int sum = 0;
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("I")) {
				if (arr.length == i + 1)
					value = 1;
				else if (arr[i + 1].equals("V") || arr[i + 1].equals("X")) {
					value = -1;
				} else
					value = 1;
			}
			if (arr[i].equals("V")) {
				value = 5;
			}
			if (arr[i].equals("X")) {
				if (arr.length == i + 1)
					value = 10;
				else if (arr[i + 1].equals("L") || arr[i + 1].equals("C")) {
					value = -10;
				} else
					value = 10;
			}
			if (arr[i].equals("L")) {
				value = 50;
			}
			if (arr[i].equals("C")) {
				if (arr.length == i + 1)
					value = 100;
				else if (arr[i + 1].equals("D") || arr[i + 1].equals("M")) {
					value = -100;
				} else
					value = 100;
			}
			if (arr[i].equals("D")) {
				value = 500;
			}
			if (arr[i].equals("M")) {
				value = 1000;
			}
			sum += value;
		}
		return sum;
	}
}
