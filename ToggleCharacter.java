import java.util.*;

public class ToggleCharacter
{
 public static void main(String s[])
 {
  
  char ch = 'S';
  
  int val = (int)ch;
  
  
  char ans;
  
  
  if(val >= 65 && val <= 90)
  {
     val = (val + 32);
  }
  else
  {
     val = (val - 32);
  }
   
   
  System.out.println("Toggle char is " + (char)(val));
   
 }
}