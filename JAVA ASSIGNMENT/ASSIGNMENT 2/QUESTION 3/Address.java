package q3;

public class Address {

	private String street;
	private String area;
	private int pincode;
	private String city;
	
	public Address() {
	}

	public Address(String street, String area, int pincode, String city) {
		
		this.street = street;
		this.area = area;
		this.pincode = pincode;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public String getArea() {
		return area;
	}

	public int getPincode() {
		return pincode;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", area=" + area + ", pincode=" + pincode + ", city=" + city + "]";
	}

	
	
}
