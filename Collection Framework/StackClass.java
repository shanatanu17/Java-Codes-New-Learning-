import java.util.Stack;

public class StackClass
{
 public static void main(String ss[])
 {
	 
	 Stack<String> animals = new Stack<>();
	 
	 animals.push("dog");
	 animals.push("cow");
	 animals.push("monkey");
	 animals.push("cat");
	 animals.push("lion");
	 
	 System.out.println( " stack : " + animals);
	 
	 
	 System.out.println(animals.peek());
	 
	 
	 System.out.println(animals.pop());
	 
	 System.out.println( " stack : " + animals);

	 
	 
	 
	 
 
 }

}