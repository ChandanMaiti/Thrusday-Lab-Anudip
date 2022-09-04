/*Create a program to show synchronization.*/
package thursdaylab25_08;


////shared object
//class SynFirstClass{
//	static synchronized void addtion(int n) //method not synchronized
//	{
//		System.out.println("Outside of synchronizede block");
//		synchronized (SynFirstClass.class) {
//		for(int i=1;i>=6;i++) {
//			System.out.println(n+i);
//			try {
//				Thread.sleep(400);
//			}catch(Exception e){
//				System.out.println(e);
//			}		
//			}//end of for
//	}//end of block
//		System.out.println("Rest of code which not to synchronizede block");
//}//end of synchronized
//}
//
//
//public class SynchronizationEx {
//
//	public static void main(String[] args) {
//		Thread td1=new Thread() 
//		{
//			public void run() 
//			{
//				SynFirstClass.addtion(1);	
//			}
//		};
//		
//		Thread td2=new Thread()
//		{
//			public void run() 
//			{
//				SynFirstClass.addtion(1);	
//			}
//		};
//	
//		
//		td1.start();
//		td2.start();
//		
//		
//	
//	}
//
//}



//shared object
class PrintData
{
static synchronized void multiplication(int n) //method not synchronized
	{
	System.out.println("Outside of synchronizede block");
		synchronized (PrintData.class) {
			
	for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}//end of for
	//	}//end of block
		System.out.println("Rest of code which not to synchronizede block");
		}
	}//end of synchronized



}


class PrintAdd{
static synchronized void addtion(int n) //method not synchronized
{
System.out.println("Outside of synchronizede block");

	synchronized (PrintAdd.class) {
		
	
for(int i=1;i<=5;i++)
	{
		System.out.println(n+i);
		
		try {
			Thread.sleep(400);
		}catch(Exception e) {
			System.out.println(e);
		}
	}//end of for

	System.out.println("Rest of code which not to synchronizede block");

}//end of synchronized
}
}



public class SynchronizationEx {

	public static void main(String[] args) {

		
		//annonymous class
		
	Thread t1=new Thread()
		{
			public void run()
			{
			PrintData.multiplication(5);
			}
		};
	Thread t2=new Thread()
		{
			public void run()
			{
				PrintData.multiplication(100);
			}
			
		};
		
		Thread t3=new Thread()
		{
			public void run()
			{
			PrintAdd.addtion(100);
			}
		};
		Thread t4=new Thread()
		{
			public void run()
			{
				PrintAdd.addtion(5000);
			}
			
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
