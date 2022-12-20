//string handling
//6b
class stem {
	public static String findstem(String arr[]) {
		int n = arr.length;
		String s = arr[0];
		int len = s.length();
		String res = "";
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				String stem = s.substring(i, j);
				int k = 1;
				for (k = 1; k < n; k++)
					if (!arr[k].contains(stem))
						break;
				if (k == n && res.length() < stem.length())
					res = stem;
			}
		}
		return res;
	}

	public static void main(String args[]) {
		String arr[] = { "grace", "graceful", "disgraceful", "gracefully" };
		String stems = findstem(arr);
		System.out.println(stems);
	}
}