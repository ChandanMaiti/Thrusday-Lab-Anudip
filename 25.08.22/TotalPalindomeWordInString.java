/*Write a program to find out total how many palindrome word is there in a string*/

package thursdaylab25_08;

//import java.util.Scanner;
//
//public class TotalPalindomeWordInString {
//
//	public static void main(String[] args) {
//		 String original = null, reverse = ""; // Objects of String class  
//		int count=0;
//		 String arr[]=original.split(" ");
//	      Scanner sc = new Scanner(System.in);   
//	      System.out.println("Enter a string/number to check if it is a palindrome");  
//	      original = sc.nextLine();   
//	      int length = original.length();
//	      for(int i=0;i<arr.length;i++) {
//	      
//	      for ( int j = length - 1; j >= 0; j-- ) { 
//	         reverse = reverse + original.charAt(i); 
//	      }
//	      }
//	      if (original.equals(reverse))  
//	         System.out.println("Entered string/number is a palindrome.");  
//	      else  
//	         System.out.println("Entered string/number isn't a palindrome.");   
//
//	}
//
//}
////class Problem16 {
////    public static void main(String[] args) {
////        
////        
////        String s1="level madam mam ";
////        String[] array1=s1.split(" ");
////        int count=0;
////        
////        for(int i=0;i<array1.length;i++) {
////            
////            String s2="";
////            
////            for(int j=(array1[i].length())-1;j>=0;j--) {
////                
////                s2=s2+array1[i].charAt(j);
////            }
////            if(array1[i].equalsIgnoreCase(s2)) {
////                count++;
////            }
////        }
////        
////        System.out.println(count);        
////        
////        }
////    }

import java.util.Scanner;

public class TotalPalindomeWordInString {
	//method to perform count palindrom string
	static int CheckPalindrome(String str)
	{
		String revStr = "";
	    int count =0;
	    int strLength = str.length(); //calculate the string length

	    for (int i = (strLength - 1); i >=0; i--) {
	      revStr = revStr + str.charAt(i); // in reverse order collect one word and add it revStr variable 
	    }

	    if (str.toLowerCase().equals(revStr.toLowerCase())) //check reverse string with original string
	    {
	      count++;
	    }
	    return count;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter string");
	    
	    int n=0;
	    
	    String s=sc.nextLine();
	    String s1[]=s.split(" "); // split the string in word to an array using the space delimiter
	    
	    for(int i=0;i<s1.length;i++)
	    	n+=CheckPalindrome(s1[i]); //call CheckPalindrome function by passing each word of the string and also checking the count
	    System.out.println("Number of palindrome word is: "+n);
	  }
	}