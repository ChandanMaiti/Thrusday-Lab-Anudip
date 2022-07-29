/*print the paprint the pattern: 
	5 4 3 2 1
	5 4 3 2
	5 4 3
	5 4
	5*/

package BasicProgram;

public class NestedLoopRowPrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=5; j>=i; j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}
}