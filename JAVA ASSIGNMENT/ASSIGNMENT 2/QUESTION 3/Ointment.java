package q3;

public class Ointment extends Medicine {

	public Ointment(String name, Address addr) {
		super(name, addr);
	}

	public void displayLabel() {
		super.displayLabel();
		System.out.println("for External Use Only");
	}
}
