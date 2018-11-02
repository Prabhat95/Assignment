package q5;

public class Car {

	private int speed;
	private int noOfGears;
	
	
	public Car() {
	}


/*	public Car(int speed, int noOfGears) {
		super();
		this.speed = speed;
		this.noOfGears = noOfGears;
	}
*/	
	public void drive(int s, int g) {
		this.speed = s;
		this.noOfGears = g;			
	}
	
	public void display() {
		
		System.out.println("Car's Speed: "+speed);
		System.out.println("Car has "+noOfGears+" gears.");
		
	}
}
