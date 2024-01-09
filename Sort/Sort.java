import java.util.*;

public class Sort
{
   public static void main(String[] args)
   {
      int[] numbers = new int[10];
      int biggestNumber = 0;
      Scanner sc = new Scanner(System.in);
      
      for (int i = 0; i < 10; i++)
      {
         System.out.print("Please enter an integer: ");
         numbers[i] = sc.nextInt();
      }  
      
      System.out.println("Your integers sorted from smallest to biggest is: ");
      
      for (int i = 0; i < 10; i++)
      {
         if (numbers[i] > biggestNumber)
         {
            biggestNumber = numbers[i];
            System.out.println(biggestNumber);
            numbers[i] = 0;
         }
      }
      
   }
}  
