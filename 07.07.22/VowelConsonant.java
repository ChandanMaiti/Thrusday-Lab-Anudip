/*write a program to input any alphabet and check whether its vowel or consonant. */
package BasicProgram;

import java.util.Scanner;

public class VowelConsonant 
{
	public static void main(String[] args)
	{
//		char ch;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter an Alphabet: ");
//		ch= scan.next().charAt(0);
//		if (ch=='a' || ch=='A' || ch=='e'|| ch=='E' || ch=='i'|| ch=='I'|| ch=='o' || ch=='O'|| ch=='u'|| ch=='U')
//		{
//			System.out.println(ch+" is Vowel.");
//		}
//		else
//		{
//			System.out.println(ch+" is Consonant.");
//		}
//		}
		//Another way
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		ch= scan.next().charAt(0);
		switch (ch) //switch(2)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.print(ch+" is a vowel");
			break;
			default:System.out.println(ch+" is a Consonant");
		}
		
		
}
}




