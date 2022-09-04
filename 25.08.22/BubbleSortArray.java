/*Write a program to calculate bubble sort.*/

package thursdaylab25_08;

import java.util.Scanner;

public class BubbleSortArray {

//	public static void main(String[] args) {
//		int arr[] = null;
//		 //asking the user for array size
//		 System.out.println("Enter array size");
//		 Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		
//		// asking the user for initalize array element
//		System.out.println("Enter "+size+" element in a array");
//		
//		//instancetiate array
//		arr=new int[size]; 
//		
//		//assign value from user
//		for(int i=0;i<size;i++) {
//		arr[i]=sc.nextInt();
//		}
//		
//		// Bubble sort
//		for(int i=0;i<size;i++) {
//			
//		}
//
//	}
//
//}
	


		public void sort(int a[])
		{
			int temp=0;
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=0;j<(a.length-i)-1;j++)
				{
					if(a[j]>a[j+1])
					{
						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
					
				}
			}
				
		}
			public static void main(String[] args) 
			{
				Scanner sc = new Scanner(System.in);
				int size,i;
				//giving the size of the array
				System.out.println("Enter the size of the array: ");
				size = sc.nextInt();
				
				int arr[] = new int[size]; //instantiate array
				System.out.println("Enter "+size+ " elements of an array: ");
				for(i=0;i<size;i++) //using for loop to take array input from user
				{
					arr[i]= sc.nextInt();
				}
				//printing array before sorting
				System.out.println("Array before sorting:");
				for(i=0;i<size;i++)
				{
					System.out.print(arr[i]+" ");
				}
				
				System.out.println();
				BubbleSortArray bs = new BubbleSortArray();//declaring object for bubble sort
				bs.sort(arr);
				
				System.out.println();
				//printing array after sorting
				System.out.println("Array after sorting");
				for(i=0;i<size;i++)
				{
					System.out.print(arr[i]+" ");
				}
			}
			}
