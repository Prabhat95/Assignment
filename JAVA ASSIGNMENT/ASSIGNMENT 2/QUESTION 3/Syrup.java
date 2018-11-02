package q3;

public class Syrup extends Medicine {
	
	public Syrup(String name, Address addr) {
		super(name, addr);
	}

	public void displayLabel() {
		super.displayLabel();
		System.out.println("Mostly used by children");
	}

}
