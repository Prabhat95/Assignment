import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		Book b[]=createBooks();
		showBooks(b);

	}

	public static void showBooks(Book[] b) {
		System.out.println("Book Title \t Book Price ");
		for(Book b1:b) {
			
			System.out.println(b1.getBook_title()+"\t\t"+b1.getBook_price());
		}
	}

	public static Book[] createBooks() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of books want to add: ");
		int n=sc.nextInt();
		Book b[]=new Book[n];
		for(int i=0;i<n;i++) {
			b[i]=new Book();
			System.out.println("Enter book title: ");
			b[i].setBook_title(sc.next());
			System.out.println("Enter book price: ");
			b[i].setBook_price(sc.nextInt());
		}
		sc.close();
		return b;
	}
	

}
