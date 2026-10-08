
import java.util.Map;
import java.util.TreeMap;


public class TreeMapClass
{
 public static void main(String ss[])
 {
	 Map<String , Integer> numbers = new TreeMap<>();
	 
	 numbers.put("One" , 1);
	 numbers.put("Two" , 2);
	 numbers.put("Three" , 3);
	 numbers.put("Four" , 4);
	 numbers.put("Five" , 5);
	 numbers.put("Six" , 6);
	 
	 System.out.println(numbers);
	 
	 
	 
	 /*
	 
	 //add key if not in set 
	 numbers.putIfAbsent("three" , 431);
	 
	 System.out.println(numbers);
	 
	 
	 //Iterate over set
	 for(Map.Entry<String , Integer> e : numbers.entrySet())
	 {
		 System.out.println(e);
		 
		 System.out.println(e.getKey());
		 System.out.println(e.getValue());
	 }
	 
	 
	 //print only keys
	 for(String key : numbers.keySet())
	 {
		 System.out.println(key);
	 }
	 
	 
	 //print only Values
	 for(Integer value : numbers.values())
	 {
		 System.out.println(value);
	 }
	 
	 
	 //checks is key present in map or not
	 System.out.println(numbers.containsKey("oe"));
	 
	 
	 //checks is Value is present in map or not
	 System.out.println(numbers.containsValue(41));
	 
	 
	 //check empty or not
	 System.out.println(numbers.isEmpty());
	 
	 
	 //clears the Hashmap
	 //numbers.clear();
	 
	 
	 //System.out.println(numbers.isEmpty());
	 
	 
	 //remove key  ---> remove(key)
	 numbers.remove("two");
	 
	 System.out.println(numbers);
	 
	 
	 */
	 
	 
	 
	 
	 
 }
}