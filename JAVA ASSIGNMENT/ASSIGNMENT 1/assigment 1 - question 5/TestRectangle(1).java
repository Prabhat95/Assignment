import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle r1[]=getData();
		display(r1);
		
		
		}	
	
	public static Rectangle[] getData() {
		
		Rectangle r[]=new Rectangle[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<r.length;i++) {
			r[i]=new Rectangle();
			System.out.println("Enter length");
			r[i].setLength(sc.nextDouble());
			System.out.println("Enter Breadth");
			r[i].setBreadth(sc.nextDouble());
		}
		sc.close();
		return r;
	}
		
	
	public static void display(Rectangle[] r) {
		for(int i=0;i<r.length;i++) {
		
			System.out.println("Calculation of rectangle "+i);
			r[i].calculate(r[i].getLength(), r[i].getBreadth());
			System.out.println("\n");
			
		}
		
	}	

}




