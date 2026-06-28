import java.util.*;

public class CheckSpyNumber
{
 public static void main(String s[])
 {
  
  int a= 134;
  
  int temp = a;
  
  int sum = 0;
  int prod = 1;
  
  
  while(temp != 0)
   { 
     int rem = temp % 10;
     sum = sum + rem;
     prod = prod * rem;
     temp = temp / 10;	 
   }
   
   if(sum == prod)
   {
	   System.out.println("Spy number");
   }
   else
   {
	   System.out.println("Not spy number");
   }
   
   
 }
}