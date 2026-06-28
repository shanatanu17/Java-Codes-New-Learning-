public class Command_Line_Argument
{
  public static void main(String s[])
   { 
     Long a  = Long.parseLong(s[0]);
     Long b = Long.parseLong(s[1]);


     String ans = (a > b ) ?  "A is greater" : "B is greater";
	 
	 System.out.println(ans);

	
   }
}