/*write a program to calculate gross salary of an employee. Basic salary 
 should be taken from user. If basic salary is grater that 1500, 
 HRA=20% and DA=90% will be given else HRA=500 and DA 70% given to the employee. 
 */

package BasicProgram;
import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basic,hrs,da,gross;
		System.out.println("Enter Basic Salary");
		Scanner scan=new Scanner(System.in);
		basic=scan.nextInt();
		if(basic<1500) {
			hrs=(basic*20)/100;
			da=(basic*90)/100;
			gross=basic+hrs+da;
			System.out.println("Gross salary is: "+gross);
		}
		else {
			hrs=500;
			da=(basic*70)/100;
			gross=basic+hrs+da;
			System.out.println("Gross salary is: "+gross);
			}
		}


}
