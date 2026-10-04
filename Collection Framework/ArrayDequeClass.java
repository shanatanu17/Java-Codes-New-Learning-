import java.util.Queue;
import java.util.ArrayDeque;

public class ArrayDequeClass
{
	public static void main(String ss[])
	{
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.offer(10);
		ad.offer(20);
		ad.offer(30);
		
		System.out.println(ad);
		
		//add element at front
		ad.offerFirst(40);
		
		System.out.println(ad);
		
		//add element at last
		ad.offerLast(50);
		
		System.out.println(ad);
		
		
		
		//remove the element (First)
		ad.poll();
		System.out.println(ad);
		
		//remove the element (First)
		ad.pollFirst();
		System.out.println(ad);
		
		//remove the element (Last)
		ad.pollLast();
		System.out.println(ad);
		
		
		//print the element from front
		System.out.println(ad.peek());
		
		
		ad.offer(40);
		ad.offer(50);
		
		System.out.println(ad);
		
		
		//print the element from Front
		System.out.println(ad.peekFirst());
		
		
		//print the last element
		System.out.println(ad.peekLast());
		
		
		
		
		
		
	}

}