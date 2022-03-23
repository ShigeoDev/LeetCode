import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		Stack<String> st = new Stack<String>();
		String[] arr = s.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("(") || arr[i].equals("{") || arr[i].equals("[")) {
				st.push(arr[i]);
			} else if (arr[i].equals(")")) {
				if (st.size() == 0) {
					return false;
				}
				if (!st.peek().equals("(")) {
					return false;
				}
				st.remove(st.size() - 1);
			} else if (arr[i].equals("}")) {
				if (st.size() == 0) {
					return false;
				}

				if (!st.peek().equals("{")) {
					return false;
				}
				st.remove(st.size() - 1);
			} else if (arr[i].equals("]")) {
				if (st.size() == 0) {
					return false;
				}
				if (!st.peek().equals("[")) {
					return false;
				}
				st.remove(st.size() - 1);
			}
		}
		if (st.size() != 0) {
			return false;
		}
		return true;
	}
}
