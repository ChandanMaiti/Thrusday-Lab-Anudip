package booksystem;
import java.util.Scanner;
public class BookMain {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		BookService bservice=new BookService();
		
		do {
			System.out.println("Welcome to book management System");
			System.out.println("=================================");
		System.out.println("Press 1 for create book details \nPress 2 for forget book details"+
					"\nPress 3 for by id get all book details \nPress 4 for update book by Id"+
				"\nPress 5 for Quit.");
		System.out.println("=================================");
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			bservice.createBook();
			System.out.println("=================================");
			break;
		case 2:bservice.getBookbyId();
			System.out.println("=================================");
			break;
		case 3:bservice.getAllBookDetails();
			System.out.println("=================================");
			break;
		case 4:bservice.upBookById();
			System.out.println("=================================");
			break;
		case 5:break;
			default:System.out.println("Enter correct choice!");
		}
		}while(choice!=5);
	System.out.println("Thanks for visit!!");
			
		}
		}