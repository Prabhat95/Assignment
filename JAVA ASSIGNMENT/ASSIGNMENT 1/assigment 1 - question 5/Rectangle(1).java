
public class Rectangle {

	private double length;
	private double breadth;
	
	public Rectangle() {
		this.length=1;
		this.breadth=1;
	}

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length>0.0 && length<20.0)
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		if(breadth>0.0 && breadth<20.0)
		this.breadth = breadth;
	}
	
	
	public void calculate(double l,double b) {
		double area=l*b;
		double perimeter=2*(l+b);
		System.out.println("Area of rectangle: "+area);
		System.out.println("Premiter of rectangle: "+perimeter);
	}
	
	
}
