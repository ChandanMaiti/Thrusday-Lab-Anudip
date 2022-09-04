/*Find minimum maximum element from an array*/

package thursdaylab25_08;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		int arr[] = null,max,min;
		 //asking the user for array size
		 System.out.println("Enter array size");
		 Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		// asking the user for initalize array element
		System.out.println("Enter "+size+" element in a array");
		
		//instancetiate array
 		arr=new int[size]; 
 		
		//assign value from user
		for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		}
		
		 //initialize max,min default location
        max =  min = arr[0];
         
        //finding max and min value
        for(int i = 1; i < size; i++) {
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
