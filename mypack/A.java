package mypack;
//working with package
//subclass
//8
public class A {
	int c, d, e, f;
	public void add(int a, int b) {
		c = a + b;
	}
	public void sub(int a, int b) {
		d = a - b;
	}
	public void mul(int a, int b) {
		e = a * b;
	}
	public void div(int a, int b) {
		f = a / b;
	}
	public void adddisplay() {
		System.out.println("Addition of two numbers " + c);
	}
	public void subdisplay() {
		System.out.println("Subtraction of two numbers " + d);
	}
	public void muldisplay() {
		System.out.println("Multiplication of two numbers " + e);
	}
	public void divdisplay() {
		System.out.println("Division of two numbers " + f);
	}
}