import java.util.*;

public class Awake
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int userChoice;
      
      System.out.println("Are you awake?");
      System.out.print("Enter 1 for yes, Enter 2 for no: ");
      
      userChoice = sc.nextInt();
      
      switch (userChoice)
      {
         case 1:
            System.out.print("You are awake!");
            break;
         case 2:
            System.out.print("You are not awake!");
            break;
         default:
            System.out.print("What are you entering?");
            break;
      }
   }
}
