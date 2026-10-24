public class PrintCurrentThreadNameAndId
{
	public static void main(String ss[])
	{
		//prints about the main thread
		System.out.println(Thread.currentThread().getName());	
	    System.out.println(Thread.currentThread().getId());	
		
		
		Thread t1 = new Thread(()->{
			System.out.println("1st thread name" + Thread.currentThread().getName());
			System.out.println("1st thread id" + Thread.currentThread().getId());	
		});
		
		
		Thread t2 = new Thread(()->{
			System.out.println("2st thread name" + Thread.currentThread().getName());
			System.out.println("2st thread id" + Thread.currentThread().getId());
		});
		
		t1.start();
		t2.start();

		
	}
}