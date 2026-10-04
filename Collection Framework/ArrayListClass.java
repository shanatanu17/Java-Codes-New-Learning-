import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ArrayListClass
{
 public static void main(String ss[])
 {
	 List<Integer> list = new ArrayList<>();
	 
	 list.add(10);
	 list.add(20);
	 
	 // System.out.println(list);
	 
	 list.add(30);
	 list.add(40);
	 list.add(50);
	 list.add(60);
	 list.add(70);
	 
	 System.out.println(list);
	 
	 
	 /*
	 
	 
	 // If want to add the element at the specific index --->  add(index , element)
	 list.add(1 , 100);
	 System.out.println(list);
	 
	 // Add a list into another list ----> list1.addAll(list2name)
	 List<Integer> list2 = new ArrayList<>();
	 
	 list2.add(17);
	 list2.add(22);
	 
	 list.addAll(list2);
     System.out.println(list);
	 
	 
	 // print the element at the specific index --- > list.get(index)
	 System.out.println(list.get(2));
	 
	 
	 //remove the element at the specific index ---> list.remove(index)
	 list.remove(3);
	 System.out.println(list);
	 
	 //remove the element with considering the ElementValue ---> 
	 list.remove(Integer.valueOf(100));
	 System.out.println(list);
	 
	 
	 
	 
	 //remove all the elements form the list
	 list.clear();
	 System.out.println(list);
	 
	 
	 */
	 
	 
	 //want to update the element of a particular index  ---> list.set(index , element)
	 list.set(4,19999);
	 System.out.println(list);
	 
	 
	 //want to check is any element is present or not in arraylist ---> list.contains(element)
	 System.out.println(list.contains(30));
	 
	 
	 
	 // Print arraylist using for loop
	 for(int i=0;i<list.size();i++)
	 {
		 System.out.println(list.get(i));
	 }
	 
	 
	 //print using foreach loop
	 for(Integer ele : list)
	 {
		 System.out.print(ele + " ");
	 }
	 
	 System.out.println();
	 
	 
	 //print using Iterator
	 Iterator<Integer> it = list.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.print(it.next() + " ");
	 }
	 
	 
	 

 }
 
}

