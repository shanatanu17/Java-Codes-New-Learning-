import java.util.*;

public class Functions
{
 public static void main(String s[])
 {
  Scanner sc = new Scanner(System.in);
  
  int no = sc.nextInt();
  
  double ans = calFactorial(no);
  
  System.out.println("Fact of a number is " + ans);
 }
 
 
 public static double calFactorial(int no)
 {
	 int fact = 1;
    while(no > 0)
	{
		fact = fact * no;
		no--;
	}
	
	return fact;
 }


}