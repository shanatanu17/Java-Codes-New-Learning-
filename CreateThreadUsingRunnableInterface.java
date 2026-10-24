class Test implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Run method runs");
	}
}


public class CreateThreadUsingRunnableInterface
{
	public static void main(String ss[])
	{
		Test t1 = new Test();
		Thread th = new Thread(t1);
		th.start();
	}
}2