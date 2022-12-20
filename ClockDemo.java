import java.lang.Exception;
import java.io.*;
import java.util.*;
//exception handling
//6b
class MyException extends Exception {
	MyException(String msg) {
		super(msg);
	}
}

class Clock {
	private int hour;
	private int minute;

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the time in hh:mm format");
		String str = br.readLine();
		StringTokenizer tokn = new StringTokenizer(str, ":");
		String h = tokn.nextToken();
		String m = tokn.nextToken();
		hour = Integer.parseInt(h);
		minute = Integer.parseInt(m);
		try {
			System.out.println("Hour:" + hour);
			if ((hour < 0) || (hour > 24)) {
				throw new MyException("Invalid hour");
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Minute:" + minute);
			if ((minute < 0) || (minute > 59)) {
				throw new MyException("Invalidminute");
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}

class ClockDemo {
	public static void main(String[] args) throws IOException {
		Clock c = new Clock();
		c.input();
	}
}
