public class CalculateGST
{
 public static void main(String s[])
 {
  int quantity = Integer.parseInt(s[0]);
  int rate = Integer.parseInt(s[1]);
  int gstpercentage = Integer.parseInt(s[2]);
  
  int totalbill = ( quantity * rate ) * gstpercentage / 100;
  
  System.out.println("Total bill after gst   " + totalbill);
  
 }
 }
