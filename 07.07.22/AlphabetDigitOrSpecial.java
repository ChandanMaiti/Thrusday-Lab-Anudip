/*wap to input any character and check whether its alphabet,digit or special character. */

package BasicProgram;

import java.util.Scanner;

public class AlphabetDigitOrSpecial {
	public static void main(String[] args) {
	char ch;
	Scanner scan=new Scanner(System.in);
	ch = scan.next().charAt(0);
	System.out.println("Enter Any Character");
	if (Character.isAlphabetic(ch))
	{
		System.out.println(ch+" is Alphabet.");
	}
	else if(Character.isDigit(ch))
	{
		System.out.println(ch+" is Digit.");
	}
	else
	{
		System.out.println(ch+" is Special Character.");
	}
	
}
}
