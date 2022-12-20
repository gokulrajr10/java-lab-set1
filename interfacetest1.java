//interface and implements
//5
interface library {
	public void draw_book();
	public void return_book();
	public void check_status();
	public void reserve_book();
}

class result implements library {
	public void draw_book() {
		System.out.println("we can draw book");
	}
	public void return_book() {
		System.out.println("we can return book");
	}
	public void check_status() {
		System.out.println("we can check status");
	}
	public void reserve_book() {
		System.out.println("we can reserve book");
	}
}

class interfacetest1 {
	public static void main(String args[]) {
		result r = new result();
		library l;
		l = r;
		System.out.println("In draw book section ");
		l.draw_book();
		System.out.println("In return book section ");
		l.return_book();
		System.out.println("In check status section ");
		l.check_status();
		System.out.println("In reserve book section ");
		l.reserve_book();
	}
}
