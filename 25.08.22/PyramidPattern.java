/*
        * 
      * * * 
     * * * * * 
   * * * * * * * 
 * * * * * * * * *

*/

package thursdaylab25_08;

import java.util.Scanner;

public class PyramidPattern {

public static void main(String[] args) {

	int i,j,k;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Number of Rows(Line):");
	int row=sc.nextInt();
	
	for(i=0; i<row; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
   { 
		for(k=i; k<row; k++) //inner loop for number of columns
		{ 
			System.out.print(" "); //print space
		}
			 for(j=1; j<(i*2); j++) {
				
				System.out.print("* "); //print star
			}
			System.out.println(); //ending line after each row
		} 
   
}
}
	        
	  