import java.util.Arrays;


public class ArraysClass
{
 public static void main(String ss[])
 {
	 
	 int numbers[] = {2,4,6,8,10,12,14};
	 
	 
	 //1 . binarysearch(array,number)  --> search an ele in sorted array and returns the index of it
	 System.out.println(Arrays.binarySearch(numbers,10));
	 
	 
	 
	 //2 .sort array ele --> sort(array)
	 int nonSort[] = {13,4,1,6,777,43};
	 Arrays.sort(nonSort);
	 
	 for(int i=0;i<nonSort.length;i++)
	 {
		 System.out.println(nonSort[i]);
	 }
	 
	 
	 //3. Fill the array with default values --> Arrays.fill(Array,default value);
	 Arrays.fill(numbers,41);
	 
	 for(int i=0;i<numbers.length;i++)
	 {
		 System.out.println(numbers[i]);
	 }
	 
	 
	 
	 
	 
 
 }

}