package q5;

public class SportCar extends Car {

	private String airBallonType;
	
	
	public SportCar() {
	}
	
	
	
	public SportCar(int s, int g, String airBallonType) {
		super.drive(s, g);
		this.airBallonType = airBallonType;
	}



	@Override
	public void display() {
		super.display();
		System.out.println("Air Ballon Type: "+airBallonType);
	}
	
}
