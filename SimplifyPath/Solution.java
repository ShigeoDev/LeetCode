import java.util.ArrayList;

class Solution {
	public String simplifyPath(String path) {
		String[] line = path.split("/");
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < line.length; i++) {
			System.out.println(line[i]);
			if (line[i].equals(""))
				continue;
			if (line[i].equals("."))
				continue;
			if (line[i].equals("..")) {
				if (arr.size() > 0)
					arr.remove(arr.size() - 1);
				continue;
			}
			arr.add(line[i]);
		}
		return "/" + String.join("/", arr);
	}
}
