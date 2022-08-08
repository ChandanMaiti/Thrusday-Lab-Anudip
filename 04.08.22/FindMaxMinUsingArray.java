/*1.wap to find out maximum and minimum number in array.
 * exm: 2 3 4 6 max=6 ,min =2*/

package arrayexamples;

import java.util.Scanner;

public class FindMaxMinUsingArray {

	public static void main(String[] args) {

		 int size, max, min, i,arr[];
		
	       //asking the user for array size
	 		Scanner sc=new Scanner(System.in);
	 		System.out.println("Enter size of an array");
	 		size=sc.nextInt();
	 		
	 		//instancetiate array
	 		arr=new int[size];
	 		
	 		// asking the user for initalize array element
	 		System.out.println("Enter "+ size +" elements in an array: ");
	   
	 		//assign value from user
	        for(i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	   //initialize max,min default location
	        max = min = arr[0];
	         
	        //finding max and min value
	        for(i = 1; i < size; i++) {
	            if(arr[i] > max)
	                max = arr[i];
	            else if (arr[i] < min)
	                min = arr[i];
	                
	        }
	        
	        //printing max and min value
	        System.out.println("Maximum value of array : " + max);
	        System.out.println("Maximum value of array : " + min);
		
		
		
	}
	}
