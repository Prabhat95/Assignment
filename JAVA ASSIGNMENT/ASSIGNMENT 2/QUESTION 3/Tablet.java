package q3;

public class Tablet extends Medicine {
	
	
	
	
	public Tablet(String name, Address addr) {
		super(name, addr);
	}

	public void displayLabel() {
		super.displayLabel();
		System.out.println("Store in Cool Dry Place");
	}

}
