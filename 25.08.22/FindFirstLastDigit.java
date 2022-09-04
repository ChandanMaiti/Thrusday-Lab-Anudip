/*Find out first and last digit*/
package thursdaylab25_08;

import java.util.Scanner;

public class FindFirstLastDigit {

	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
				 
			 for ( ; n>=10; )
				{
					n = n/10;
				}
			 int firstDigit = n;
				System.out.println("\nFirst digit of number: " +firstDigit);
			int  lastDigit=n%10;
				 System.out.println("Last Digit of number: "+lastDigit);
		 }
		 

	}

