import mypack.*;
import java.util.Scanner;
//working with package
//8
class Addmain {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		A obj = new A();
		System.out.println("enter the value of a");
		int c = s.nextInt();
		System.out.println("Enter the value of b");
		int d = s.nextInt();
		obj.add(c, d);
		obj.adddisplay();
		obj.sub(c, d);
		obj.subdisplay();
		obj.mul(c, d);
		obj.muldisplay();
		obj.div(c, d);
		obj.divdisplay();
	}
}
