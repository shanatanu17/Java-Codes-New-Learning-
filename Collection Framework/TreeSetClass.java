import java.util.TreeSet;
import java.util.Set;

public class TreeSetClass
{
 public static void main(String ss[])
 {
	 //internally works like binary search tree 
	 //sorts the elements 
	 
	 //TreeSet = Set  +  sorted elements
	 
	 Set<Integer> hs = new TreeSet<>();
	 
		
		//add element in hashset
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		
		hs.add(60);
		hs.add(70);
		hs.add(50);
		
		System.out.println(hs);
		
		
		//remove the element form hashset  ---> hs.remove(element)
		hs.remove(30);
		
		System.out.println(hs);
		
		
		//check the element is present or not
		System.out.println(hs.contains(50));
		
		
		//check is set is empty or not
		System.out.println(hs.isEmpty());
		
		
		//check the set size
		System.out.println(hs.size());
		
		
		//remove all elements from set
		hs.clear();
		System.out.println(hs);
	 
	 
	 
 
 }
}