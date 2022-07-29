/* W.a.p to Calculate bonus.if employee is serving in org for more than 3 years,
 *  bonus=2500 will be given to employee */

package BasicProgram;

import java.util.Scanner;

public class CalculateBonus {

	public static void main(String[] args) {
	
		int bonus=2500;  //given in Question
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Joining Year");
		int joinYear=sc.nextInt();
		
		System.out.println("Enter your Current Year");
		int currentYear=sc.nextInt();
		
		int ServeYear=currentYear-joinYear ;
		
		if(ServeYear >3)
			System.out.println(bonus+" Bonus will be given to employee");
		else
			System.out.println("You are not eligible to take Bounus");
		
		
		sc.close();
	}

}
