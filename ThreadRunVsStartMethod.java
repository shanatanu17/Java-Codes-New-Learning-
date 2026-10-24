


public class ThreadRunVsStartMethod
{
	public static void main(String ss[])
	{
		Thread t1 = new Thread(()->{
			System.out.println("Current thread is " + Thread.currentThread().getName());
		});
		
		t1.start();
		// t1.run();
		
		
	}
}