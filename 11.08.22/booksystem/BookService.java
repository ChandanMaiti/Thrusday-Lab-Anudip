package booksystem;
import java.util.Scanner;
public class BookService {
	static Book book[]=new Book[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	//create book method
	public static void createBook() {
		
		System.out.println("Enter book id: ");
		int id = sc.nextInt();
		sc.nextLine(); //it will consume the \n character
		
		System.out.println("Enter Book Name: ");
		String bname=sc.nextLine();
		
		System.out.println("Enter Book Price: ");
		double price=sc.nextDouble();
		
		book[index]=new Book(id,bname,price);
		index++;//1,2
		System.out.println("Book Details Created successfully");
		
	}
	
	//get all book details
	public static void getAllBookDetails() {
		for(int i=0;i<index;i++) {
			System.out.println("Book id:"+book[i].getBookId());
			System.out.println("Book Name:"+book[i].getBookName());
			System.out.println("Book Price:"+book[i].getBookPrice());
		System.out.println("==================================");
		}
		}
	//get all book details based on id
	public static void getBookbyId() {
		
		boolean f=false;
		System.out.println("Enter the book id: ");
		int id=sc.nextInt();
		
		for(int i=0;i<index;i++)
		{
			if(id==book[i].getBookId()) {
				System.out.println("Book id:"+book[i].getBookId());
				System.out.println("Book id:"+book[i].getBookName());
				System.out.println("Book id:"+book[i].getBookPrice());
				System.out.println("==================================");	
			}
			f=true;
			break;
		}
		
	if(f==false)
	System.out.println("==================================");
	}
public static void upBookById()
{
	boolean status=true;
	
	System.out.println("Enter book id to update book details: ");
	int id=sc.nextInt();
	
	sc.nextLine();
	for(int i=0;i<index;i++) {
		System.out.println("Enter book id: ");
		int bid=sc.nextInt();
		sc.nextLine(); //it will consume the \n character
		
		System.out.println("Enter Bok name: ");
		String bname=sc.nextLine();
		
		System.out.println("Enter Book Price: ");
		double price=sc.nextDouble();
		book[i]=new Book(bid,bname,price);
		System.out.println("Book has been updated successfully!");
		status=true;
		
	}
	if(status ==false)
	{
		System.out.println("Book id not found!");
		System.out.println("==========================");
	}
	}
}
	