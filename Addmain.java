import mypack.*;
import java.util.Scanner;
//working with package
//8
class Addmain {
	public static void main(String args[]) {
		Scanner s1 = new Scanner(System.in);
		A s = new A();
		System.out.println("enter the value of a");
		int c = s1.nextInt();
		System.out.println("Enter the value of b");
		int d = s1.nextInt();
		s.add(c, d);
		s.adddisplay();
		s.sub(c, d);
		s.subdisplay();
		s.mul(c, d);
		s.muldisplay();
		s.div(c, d);
		s.divdisplay();
	}
}
