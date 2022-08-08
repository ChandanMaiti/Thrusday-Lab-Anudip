/*wap to copy all elements from an array to another array.
 * one array arr1[]=1234 =>copying array  arr2[]=1234
 * */

package arrayexamples;

import java.util.Scanner;

public class CopyElementFromAnArrayToAnotherArray {

	public static void main(String[] args) {
		
		int arr1[],arr2[],i,j,size;
		
		System.out.println("Enter array size: ");
		
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		
		arr1=new int[size];
		
		// asking the user for initalize array element
 		System.out.println("Enter "+ size +" elements in an array: ");
   
 		//assign value from user for arr1[]
        for(i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
       //Create another array arr2 with size of arr1  
        arr2= new int[size];  
          
        //Copying all elements of one array into another  
        for (i = 0; i <size; i++) {   
            arr2[i] = arr1[i];   
        }    
		
      //Displaying elements of array arr1   
        System.out.println("Elements of original array: ");  
        for (i = 0; i < size; i++) {   
           System.out.print(arr1[i] + " ");  
        }   
          
        System.out.println("\n======================================================");  
          
        //Displaying elements of array arr2   
        System.out.println("Elements of new array: ");  
        for (i = 0; i < size; i++) {   
           System.out.print(arr2[i] + " ");  
        }   
        
        
        
		
	}

}
