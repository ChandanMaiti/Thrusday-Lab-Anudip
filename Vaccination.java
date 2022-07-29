/*Create abstract class vaccine
 * Create 2 concrete method firstDose() and 2ndDose().
 * *Scenario 1:user can take first dose if user is Indian and age is 18.
 * After vaccination user has to pay 250rs.
 * *Scenario 2: user can take 2nd dose if already the first dose has completed.
 * *Scenario 3: create abstract method boosterDose() in abstract class Vaccine.
 * Create one implementation class vaccinationSuccessful where implement boosterDose() method. 
 * Create main class Vaccination and invoke all methods accord.
 */


package abstractiondemo;

import java.util.Scanner;


public class Vaccination {

	public static void main(String[] args) {
		
		System.out.println("If you Indian press 1");
		int n = 0 ;
		Scanner sacn=new Scanner(System.in);
		n= sacn.nextInt();
		
		
	
		if (n==1) {
			System.out.println("Enter your age: ");
			n= sacn.nextInt();

			if (n>=18) {
				System.out.println("You are eligible for Vactination.");	
				System.out.println("=======================================");
				
				System.out.println("If you want 1st Dose press 1. \nIf you already done 1st Dose press 2. \nIf you already done 1st & 2nd  Dose press 3.");
				System.out.println("=======================================");
				n= sacn.nextInt();
				
				if (n==1){
					System.out.println("Please pay 250rs.");
					n=sacn.nextInt();
					if (n==250){
						System.out.println("Your vacctination was Successful");
					}
				}
				else if( n==2)
				{
					System.out.println("You are eligible for 2nd Dose."); 
					System.out.println("Your vacctination was Successful");
				}
				else
				{
					System.out.println("You are eligible for Booster Dose.");
					System.out.println("Your vacctination was Successful");
				}
			 
			}
		 
		else {
			System.out.println("Your not aligible for Vaccination.\nThank you.");
		}
	
	}
		

	}

}
