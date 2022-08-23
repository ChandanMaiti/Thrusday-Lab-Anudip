package studentadmissionsystem;
import java.util.Scanner;

public class StudentService {
	static Student stdjava[]=new Student[50];
	static Student stdaws[]=new Student[50];
	
	static Scanner sc=new Scanner(System.in);
	static int javaindex=0;
	static int awsindex=0;
	
	//create java Student Details method
	public static void createJavaStudentDetails() {
		
		System.out.println("Welcome to java Course \n");
		System.out.println("Enter Student id: ");
		int stid = sc.nextInt();
		sc.nextLine(); //it will consume the \n character
		
		System.out.println("Enter Student Name: ");
		String stname=sc.nextLine();
		
		System.out.println("Enter Student Email Id: ");
		String stemail=sc.nextLine();
		
		System.out.println("Enter Student Phone no.: ");
		long stphno=sc.nextLong();
		
		stdjava[javaindex]=new Student(stid,stname,stemail, stphno);
		javaindex++;//1,2
		
		System.out.println("Java batch Student Details Added successfully");	
	}
	
	//create Aws Student Details method
		public static void createAwsStudentDetails() {
			
			System.out.println("Welcome to Aws Course \n");
			System.out.println("Enter Student id: ");
			int stid = sc.nextInt();
			sc.nextLine(); //it will consume the \n character
			
			System.out.println("Enter Student Name: ");
			String stname=sc.nextLine();
			
			System.out.println("Enter Student Email Id: ");
			String stemail=sc.nextLine();
			
			System.out.println("Enter Student Phone no.: ");
			long stphno=sc.nextLong();
			
			stdaws[awsindex]=new Student(stid,stname,stemail, stphno);
			awsindex++;//1,2,3....
			
			System.out.println("Aws batch Student Details Added successfully");
			
		}
	
//	//get java batch student details
//	public static void getJavaBatchStudentDetails()
//	{
//		for(int i=0;i<javaindex;i++)
//		{
//			System.out.println("Student Id:"+stdjava[i].getStudentId());
//			System.out.println("Student Name:"+stdjava[i].getStudentName());
//			System.out.println("Student Email Id:"+stdjava[i].getEmailId());
//			System.out.println("Student Phone No:"+stdjava[i].getPhoneNo());
//		System.out.println("==========================================");
//		}
//		}
//	public static void getAwsBatchStudentDetails()
//	{
//		for(int i=0;i<awsindex;i++)
//		{
//			System.out.println("Student Id:"+stdaws[i].getStudentId());
//			System.out.println("Student Name:"+stdaws[i].getStudentName());
//			System.out.println("Student Email Id:"+stdaws[i].getEmailId());
//			System.out.println("Student Phone No:"+stdaws[i].getPhoneNo());
//		System.out.println("=============================================");
//		}
//		}
	
	//get java batch student details based on id
	public static void getJavaBatchStudentDetails() {
		
		boolean f=false;
		System.out.println("Enter the Student id: ");
		int id=sc.nextInt();
		
		for(int i=0;i<javaindex;i++)
		{
			if(id==stdjava[i].getStudentId()) {
				System.out.println("Student id:"+stdjava[i].getStudentId());
				System.out.println("Student id:"+stdjava[i].getStudentName());
				System.out.println("Student id:"+stdjava[i].getEmailId());
				System.out.println("Student id:"+stdjava[i].getPhoneNo());
				System.out.println("==================================");	
			}
			f=true;
			break;
		}
		
	if(f==false)
	System.out.println("==================================");
	}
	//get Aws batch student details based on id
		public static void getAwsBatchStudentDetails() {
			
			boolean f=false;
			System.out.println("Enter the Student id: ");
			int id=sc.nextInt();
			
			for(int i=0;i<awsindex;i++)
			{
				if(id==stdaws[i].getStudentId()) {
					System.out.println("Student id:"+stdaws[i].getStudentId());
					System.out.println("Student id:"+stdaws[i].getStudentName());
					System.out.println("Student id:"+stdaws[i].getEmailId());
					System.out.println("Student id:"+stdaws[i].getPhoneNo());
					System.out.println("==================================");	
				}
				f=true;
				break;
			}
			
		if(f==false)
		System.out.println("==================================");
		}
	
	//update details Java Batch Student details based on id
public static void upJavaStudentById() throws StudentIdNotFountException
{
	boolean status=false;
	
	System.out.println("Enter Student id to update student details: ");
	int id=sc.nextInt();
	for(int i=0;i<javaindex;i++) {
	if(id==stdjava[i].getStudentId())
	{
	
		System.out.println("Enter Student id: ");
		int stid=sc.nextInt();
		sc.nextLine(); //it will consume the \n character
		
		System.out.println("Enter Student name: ");
		String stname=sc.nextLine();
		
		System.out.println("Enter Student Email Id: ");
		String stemail=sc.nextLine();
		
		System.out.println("Enter Student Phone No: ");
		long stphno=sc.nextInt();
		
		stdjava[i]=new Student(stid,stname,stemail, stphno);
		System.out.println("Java Student Details has been updated successfully!");
		status=true;
	}
	
	}
	if(status ==false)
	{
		throw new StudentIdNotFountException("Student id not found!");
	}
	}

//update details Aws Batch Student details based on id
public static void upAwsStudentById() throws StudentIdNotFountException
{
	boolean status=true;
	
	System.out.println("Enter Student id to update student details: ");
	int id=sc.nextInt();
	
	sc.nextLine();
	for(int i=0;i<awsindex;i++) {
		System.out.println("Enter Student id: ");
		int stid=sc.nextInt();
		sc.nextLine(); //it will consume the \n character
		
		System.out.println("Enter Student name: ");
		String stname=sc.nextLine();
		
		System.out.println("Enter Student Email Id: ");
		String stemail=sc.nextLine();
		
		System.out.println("Enter Student Phone No: ");
		long stphno=sc.nextInt();
		
		stdaws[i]=new Student(stid,stname,stemail, stphno);
		System.out.println("Aws Student Details has been updated successfully!");
		status=true;
		break;
		
	}
	if(status==false)
	{
		throw new StudentIdNotFountException("Student id not found!");
	}
	}
}
	