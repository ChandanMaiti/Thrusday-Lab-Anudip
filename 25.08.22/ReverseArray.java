/*Print reverse of an array*/

package thursdaylab25_08;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter size of an Array.");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		//instancetiate array
			int[] arr=new int[size];
		
			//initalize array
		System.out.println("Enter "+size+" element in an  array");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array is:");
		for(i=0;i<size;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println("\nRevers Array is:  ");
		//i = length - 1; i >= 0
		for(i=size-1;i>=0; i-- ) {
		System.out.print(arr[i]+" ");
		}

	}

}
