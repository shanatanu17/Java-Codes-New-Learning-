import java.util.Queue;
import java.util.LinkedList;

public class LinkedListUsingQueueInterface
{
 public static void main(String ss[])
 {
	 //created a linkedlist which offers the methods of queue
	 Queue<Integer> queue = new LinkedList<>();
	 
	 
	 
	 //add an element ---> offer(element)
	 queue.offer(10);
	 queue.offer(20);
	 queue.offer(30);
	 
	 System.out.println(queue);
	 
	 
	 // remove an element ---> poll();
	 System.out.println("poped element " + queue.poll());
	 System.out.println(queue);
	 
	 
	 //show the top element in queue
	 System.out.println(queue.peek());
	 
	 System.out.println("poped element " + queue.poll());
	 System.out.println("poped element " + queue.poll());
	 
	 System.out.println(queue);
	 
	 
	 //If queue is empty and we try to access the top ele , then element() throws the exception.
	 System.out.println(queue.element());
	 
	 
	 
	 
	 
	 
 
 
 }


}