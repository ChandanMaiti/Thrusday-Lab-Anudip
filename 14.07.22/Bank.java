/*create a bank class to calculate withdraw and deposit.if amount will be 
  given from user.if amount is sufficient then “withdraw successful” will 
  going to print. Later on deposit 5000rs in the account balance. 
 */

package BasicProgram;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=30000,withdraw=0,deposit,choice;
		do {
			
		
		System.out.println("Press 1 for withdraw\n Press 2 for Deposit.\n Press 3 for Quit.");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		if(choice==1) {
		System.out.println("Enter withdraw amount");		
		
		amount=scan.nextInt();
		
		if(amount<=10000)
		{
		withdraw=10000-amount;

			System.out.println("Withdraw successful.\nCurrent Balance is: "+withdraw);
		}
		else
			System.out.println("Sorry.Your have entered an Insufficent amount.");
			
		}if(choice==2) {
			System.out.println("Enter amount to deposit.");
			deposit=scan.nextInt();
			amount=amount+deposit;
			System.out.println("Deposit Successful.\nCurrennt Balance is: "+amount);
		}
		}while(choice!=3);
		
	} 		
}
		
