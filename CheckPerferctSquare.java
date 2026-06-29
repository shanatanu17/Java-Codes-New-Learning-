import java.util.*;

public class CheckPerferctSquare
{
 public static void main(String s[])
 {
  Scanner sc = new Scanner(System.in);
  
  int no = sc.nextInt();
  
  double sqrtno = Math.sqrt(no);
  
  boolean ans = (sqrtno == (int)sqrtno ) ? true : false;
  
  System.out.println(ans);
 }
}