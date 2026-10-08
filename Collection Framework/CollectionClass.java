import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionClass
{
 public static void main(String ss[])
 {
	 List<Integer> list = new ArrayList<>();
	 list.add(10);
	 list.add(4);
	 list.add(3);
	 list.add(9);
	 list.add(10);list.add(10);list.add(10);list.add(10);
	 
	 System.out.println("min ele " + Collections.min(list));
	 System.out.println("max ele " + Collections.max(list));
	 
	 System.out.println("Frequency of 10 is " + Collections.frequency(list , 10));   // -- > (list , number)
	 
	 Collections.sort(list);
	 
	 System.out.println(list);
	 
	 
	 
	 Collections.sort(list , Comparator.reverseOrder());
	 System.out.println(list);
	 
	 
 
 
 }

}