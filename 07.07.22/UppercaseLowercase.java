/*wap to check whether a character is uppercase or lowercase.*/

package BasicProgram;

import java.util.Scanner;

import java.util.Scanner;

public class UppercaseLowercase {
	public static void main(String[] args) {
		char ch;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any Letter");
		ch = scan.next().charAt(0);
		if(Character.isUpperCase(ch)) {
			System.out.println(ch+" is UpperCase.");
		}
		else if(Character.isLowerCase(ch)) {
			System.out.println(ch+" is LowerCase.");
		}
		
	}
}
