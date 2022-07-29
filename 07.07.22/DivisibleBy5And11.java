/*write a program to to check if th number is divisible by 5 and 11 or not. */

package BasicProgram;

import java.util.Scanner;

public class DivisibleBy5And11 
{
	public static void main(String[] args)
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to check whether number");
		num = scan.nextInt();
		if (num%5==0 && num%11==0) // && meaning AND
			
		{
			System.out.println("Given number "+num+" is Divisible by 5 and 11");		
		}
		else
		{
			System.out.println("Given number "+num+" is not Divisible by 5 and 11");
		}
	}
}