package q4;

public class OperationPerform {

	public static void main(String[] args) {
		
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String c=args[2];
		
		System.out.println("First Number : "+a);
		System.out.println("Second Number : "+b);		
		System.out.println("Operation : "+c);
		
		
		System.out.print("Result : ");
		switch(c)
		{
		case "+":
			System.out.println(a+b);
			break;
			
		case "*":
			System.out.println(a*b);
			break;
			
		case "-":
			System.out.println(a-b);
			break;
			
		case "/":
			System.out.println(a/b);
			break;
			
			default:
				System.out.println();
			
			
		}

		
		
  

		
		

	}

}
