import java.util.Set;
import java.util.HashSet;

public class HashSetClass
{
	public static void main(String ss[])
	{
		
		//set stores only unique values , it generated the hashcode for each entry of element and compare that hashcode with new element 
		Set<Integer> hs = new HashSet<>();
		
		//add element in hashset
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		
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