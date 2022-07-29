/*write a program to create Book management system.
create class name Book,and perform following actions:
Attributes:
bookid,bookName,bookPrice,authorName,library name(static),availability
method:
createBook() will store book details.(add atleast 5 books).
displayBook()will display book details
displayBookByName(): display specific book details based on bookName
borrowBook(): borrow book if book is available based on bookName,then make availability status as "not available"
 */
package BasicProgram;

	class Book {
		 
	int bookId,bookPrice;
	boolean availability;
	String bookName,authorName,libraryName;
	public Book(int bookId, String bookName, String authorName, int bookPrice,String libraryName, boolean availability) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookPrice=bookPrice;
		this.libraryName=libraryName;
		this.availability=availability;
	}
	public void display() {
		System.out.println("This is "+this.bookName);
	}
	public void getData(){
		
		display();//compiler will change this line with this.display();
		System.out.println("Book id: "+bookId+"\n Book Name: "+bookName+"\n Author Name: "+authorName+"\n Book Price:"+bookPrice+ "\nLibrary Name: "+libraryName+"\n Availability:" +availability);
	}
}
public class BookDemo{

	public static void main(String args[]){

		Book b1=new Book(001,"Java Learning","C.Maiti",2999,"Kolkata Library ",true);
	
		b1.getData();

		Book b2=new Book(002,"Python Programmimg","T.K Dhar",1999,"Medinipur Library",true);

		b2.getData();

}

}
