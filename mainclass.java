//exception handling
//6a
class Test {
	void charac(char ch) {
		try {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				throw new Exception("vowel character found");
			if (ch == ' ')
				throw new Exception("blank space found");
			if (ch == 'x') {
				throw new Exception("exit character found");
			} else {
				System.out.println("valid character found");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class mainclass {
	public static void main(String args[]) {
		Test t = new Test();
		char chh = args[0].charAt(1);
		t.charac(chh);
		System.out.println("Execution successfull");
	}
}