import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueClass
{
  public static void main(String ss[])
  {
    //Queue<Integer> pq = new PriorityQueue<>();
	
	Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
	
	
	//adds the ele in pq
	pq.offer(30);
	pq.offer(10);
	pq.offer(20);
	pq.offer(40);
	pq.offer(70);
	pq.offer(80);
	pq.offer(3);
	pq.offer(123);
	pq.offer(456);
	
	
	System.out.println("Priority queue ele : " + pq);
	
	
	//removes the front ele
	pq.poll();
	System.out.println("Priority queue ele : " + pq);
	
	
	//shows top ele of pq
	System.out.println(pq.peek());
	
	
	
  
  
  }
  
}