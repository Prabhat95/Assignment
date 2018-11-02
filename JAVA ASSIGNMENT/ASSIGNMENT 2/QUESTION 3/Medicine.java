package q3;

public class Medicine {

	private String name;
	private Address addr;
	
	public void displayLabel() {
	
		System.out.println("Company Name: "+name);
		System.out.println(addr);
		
	}

	
	public Medicine(String name, Address addr) {
		super();
		this.name = name;
		this.addr = addr;
	}


	public String getStreet() {
		return addr.getStreet();
	}


	public String getArea() {
		return addr.getArea();
	}


	public int getPincode() {
		return addr.getPincode();
	}


	public String getCity() {
		return addr.getCity();
	}


	@Override
	public String toString() {
		return "Medicine [name=" + name + ", addr=" + addr + "]";
	}
	
	
	
}
