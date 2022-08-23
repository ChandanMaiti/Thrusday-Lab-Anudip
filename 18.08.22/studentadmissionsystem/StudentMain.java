package studentadmissionsystem;

import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) throws StudentIdNotFountException {
		int choice = 0;
		
		Scanner sc=new Scanner(System.in);
		StudentService sservice=new StudentService();
		
//		do {
//			System.out.println("Welcome to Student Admission System");
//			System.out.println("Which course you want to admission?\nFor Java Press 1\nFor Aws Press 2\nFor Other Press 3");
//			
//			System.out.println("=================================");
//			System.out.println("Press 1 for Create Java Batch student details \n"
//							   +"Press 2 for Create Aws Batch student details \n"
//							   +"Press 3 for get Java Batch Student details \n"
//							   +"Press 4 for get Aws Batch Student details \n"
//							   +"Press 5. Update Java Student Details \n"
//						       +"Press 6. Update Aws Student Details \n"
//							   +"Press 7 for Quit.");
//		System.out.println("=================================");
//		System.out.println("Enter your choice: ");
//		choice=sc.nextInt();
//		switch(choice) {
//		case 1:
//			sservice.createJavaStudentDetails();
//			System.out.println("=================================");
//			break;
//		case 2:
//			sservice.createAwsStudentDetails();
//			System.out.println("=================================");
//			break;
//		case 3:sservice.getJavaBatchStudentDetails();
//			System.out.println("=================================");
//			break;
//		case 4:sservice.getAwsBatchStudentDetails();
//		System.out.println("=================================");
//		break;
//		
//		case 5:
//			try{
//				sservice.upJavaStudentById();
//			}
//			catch(StudentIdNotFountException e)
//			{
//				System.out.println(e.getMessage());
//			}
//			System.out.println("=================================");
//			break;
//			
//		case 6:
//			try{
//				sservice.upAwsStudentById();
//			}
//			catch(StudentIdNotFountException e) 
//			{
//				System.out.println(e.getLocalizedMessage());
//			}
//		System.out.println("=================================");
//		break;
//		
//		case 7:
//			System.out.println("Exit Succesfully");
//			System.exit(0);
//			break;
//			
//			default:
//				try {
//					throw new NoCourseFoundException("Sorry..This Course is not Available");
//				}
//				catch(NoCourseFoundException e){
//					System.out.println(e.getMessage());
//				}
//				break;
//		}
//		}while(choice!=8);
//	System.out.println("Thanks for visit!!");
//			
//		}
//}
		
		System.out.println("Welcome to Student Admission System\n");
		System.out.println("Which course you want to admission?\nFor Java & Aws Press 1\nFor Other Press 2");
		choice=sc.nextInt();
		if (choice==1){
			do {

			System.out.println("=================================");
			System.out.println( "Press 1. for Create Java Batch student details \n"
							   +"Press 2. for Create Aws Batch student details \n"
							   +"Press 3. for get Java Batch Student details \n"
							   +"Press 4. for get Aws Batch Student details \n"
							   +"Press 5. Update Java Student Details \n"
						       +"Press 6. Update Aws Student Details \n"
							   +"Press 7. for Quit.");
			System.out.println("=================================");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
			sservice.createJavaStudentDetails();
			System.out.println("=================================");
			break;
			case 2:
			sservice.createAwsStudentDetails();
			System.out.println("=================================");
			break;
			case 3:sservice.getJavaBatchStudentDetails();
			System.out.println("=================================");
			break;
			case 4:sservice.getAwsBatchStudentDetails();
			System.out.println("=================================");
			break;

			case 5:
			try{
				sservice.upJavaStudentById();
			}
			catch(StudentIdNotFountException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("=================================");
			break;

			case 6:
			try{
				sservice.upAwsStudentById();
			}
			catch(StudentIdNotFountException e) 
			{
				System.out.println(e.getLocalizedMessage());
			}
			System.out.println("=================================");
			break;

			case 7:
			System.out.println("Quit Succesfully");
			//System.exit(0);
			break;
			
			
			}
			}while(choice!=7);
				}
		else{
			try {
				throw new NoCourseFoundException("Sorry..Others Course is not Available");
			}
			catch(NoCourseFoundException e){
				System.out.println(e.getMessage());
			}
		
	}System.out.println("Thanks for visit!!");
		
	}
}
