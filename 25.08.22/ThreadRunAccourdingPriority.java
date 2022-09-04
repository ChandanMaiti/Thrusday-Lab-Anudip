/*Create 3 thread ans run according to priority.*/

package thursdaylab25_08;

public class ThreadRunAccourdingPriority extends Thread {
//	public ThreadRunAccourdingPriority(String Name) {
//		super (Name);
//	}
	public void run() {
		System.out.println("The Running Thread is "+
		Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());
	}
	

public static void main(String[] args) {
	//new state //create Thead object with name
	ThreadRunAccourdingPriority td1=new ThreadRunAccourdingPriority(); 
	ThreadRunAccourdingPriority td2=new ThreadRunAccourdingPriority();
	ThreadRunAccourdingPriority td3=new ThreadRunAccourdingPriority();
	

	td1.setName("Thread_1"); //create thread name
	td2.setName("Thread_2");
	td3.setName("Thread_3");
	
	
	td1.setPriority(Thread.MIN_PRIORITY);//1
	td2.setPriority(Thread.NORM_PRIORITY);//5
	td3.setPriority(Thread.MAX_PRIORITY);//10
	
	//runnable state
		td1.start();
		td2.start();
		td3.start();
	}

}
