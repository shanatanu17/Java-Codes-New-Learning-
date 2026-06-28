import java.util.*;

public class LeftAndRightShiftOperators
{
 public static void main(String s[])
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter a value");
  int a = sc.nextInt();

   //int b = a << 2; 
   //System.out.println("B value " + b);
  
  
  int b = a >> 2;
  System.out.println(b);
 }
}