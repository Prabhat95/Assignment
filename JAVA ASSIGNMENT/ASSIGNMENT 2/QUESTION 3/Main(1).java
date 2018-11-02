package q3;

public class Main {

	public static void main(String[] args) {

		 
		Medicine m = new Tablet("A", new Address("a","ac",1,"ab"));
		m.displayLabel();
		System.out.println();
		m = new Syrup("B",new Address("b","ac1",11,"ab1"));
		m.displayLabel();
		System.out.println();
		m = new Ointment("C",new Address("c","ac1",11,"ab1"));
		m.displayLabel();

	}

}
