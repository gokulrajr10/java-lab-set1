import java.util.Scanner;
//hierarchial inheritance
//4
class Bankaccount {
	static int balance;
	Bankaccount() {
		Scanner obj = new Scanner(System.in);
		System.out.println("\nEnter the amount ");
		balance = obj.nextInt();
	}
	void findbalance() {
		System.out.println("Your balance is " + balance);
	}
}

class Savingacc extends Bankaccount {
	Savingacc() {
		balance = balance + 100;
	}
	void display() {
		findbalance();
	}
}

class Currentacc extends Bankaccount {
	Currentacc() {
		balance = balance + 500;
	}
	void display1() {
		findbalance();
	}
}

class Fixeddeposit extends Bankaccount {
	Fixeddeposit() {
		balance = balance + 1000;
	}
	void display2() {
		findbalance();
	}
}

class Result{
	public static void main(String args[]) {
		Savingacc s = new Savingacc();
		System.out.println("In saving account ");
		s.display();
		Currentacc c = new Currentacc();
		System.out.println("In current account ");
		c.display1();
		Fixeddeposit f = new Fixeddeposit();
		System.out.println("In fixeddeposit ");
		f.display2();
	}
}