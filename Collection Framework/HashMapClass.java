
import java.util.Map;
import java.util.HashMap;


public class HashMapClass
{
 public static void main(String ss[])
 {
	 Map<String , Integer> numbers = new HashMap<>();
	 
	 numbers.put("one" , 1);
	 numbers.put("two" , 2);
	 
	 numbers.put("one" , 134);
	 
	 //System.out.println(numbers);
	 
	 
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
	 
	 
	 
	 
	 
 }
}