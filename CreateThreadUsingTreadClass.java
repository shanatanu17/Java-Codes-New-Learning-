class Test extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Run method runs");
	}
}




public class CreateThreadUsingTreadClass
{
	public static void main(String ss[])
	{
		Test t1 = new Test();
		t1.start();
		
	}
}