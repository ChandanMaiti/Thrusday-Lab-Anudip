package thursdaylab25_08;

import java.util.Scanner;

public class FindFirstLastElementArray {

	public static void main(String[] args) {
		int arr[] = null;
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
		System.out.println("First digit of array: "+arr[0]);
		System.out.println("Last digit of array: "+arr[size-1]);
		
	}

}
