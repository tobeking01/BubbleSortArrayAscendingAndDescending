/*@Author Tobechi Onwenu
 * 
 * Bubble sort array in ascending of descending order using the bubble sort method  technique 
 * 
 */

public class BubbleSortArrayAscendingAndDescending 
{
   private static void bubbleSortAscending(int[] array)  // in ascending order
   {
      int temp = 0;
      for(int i = 0; i < array.length; i++) 
      {
         for(int j=1; j < (array.length - i); j++) 
         {
            if(array[j-1] > array[j]) 
            { 
               temp = array[j-1]; 
               array[j-1] = array[j];
               array[j] = temp;
            } 
         } 
      } 
   }
   private static void bubbleSortDescending(int[] array) 
   {
	   int temp2 = 0;
	   for(int i = 0; i < array.length; i++) 
	   {
		   for(int j = 1; j < array.length-i; j++) 
		   {
	            if(array[j-1] < array[j]) 
	            { 
	               temp2 = array[j-1]; 
	               array[j-1] = array[j];
	               array[j] = temp2;
	            }
		   }
	   }
   }
   public static void main(String[] args) 
   {
      int myArray[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 }; 
      System.out.println("Array Before Bubble Sort is: ");
      System.out.print("[");
      for(int i = 0; i < myArray.length; i++) 
      {
         System.out.print(myArray[i] + ", ");
      }
      System.out.print("]\n\n");
      
      bubbleSortAscending(myArray);
      System.out.println("Array After Bubble Sort in Ascending order is: ");
      System.out.print("[");
      for(int i = 0; i < myArray.length; i++) 
      {
         System.out.print(myArray[i] + " , ");
      } 
      System.out.print("]\n\n");
      
      bubbleSortDescending(myArray);
      System.out.println("Array After Bubble Sort in Descending order is: ");
      System.out.print("[");
      for(int i = 0; i < myArray.length; i++) 
      {
         System.out.print(myArray[i] + " , ");
      }
      System.out.print("]");
   }  
}  