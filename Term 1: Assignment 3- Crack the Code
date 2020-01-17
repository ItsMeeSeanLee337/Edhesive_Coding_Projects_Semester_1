import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Welcome. What is your name?");
    String userName = console.nextLine();
    System.out.println("Hello " + userName + ". Try your best to crack the code!");
    System.out.println(" ");
    System.out.println("PHASE 1");
    System.out.println("Enter a number:");
    int num1 = console.nextInt();
    if (num1 == 3)
    {
      System.out.println("Correct!");
      System.out.println(" ");
      System.out.println("PHASE 2");
      System.out.println("Enter a number:");
      int num2 = console.nextInt();
      if ((num2 == 1) || ((num2 >= 33) && (num2 <= 100))) 
      {
        System.out.println("Correct!");
        System.out.println(" ");
        System.out.println("PHASE 3");
        System.out.println("Enter a number:");
        int num3 = console.nextInt();
        if (((num3 >= 0) && (num3 % 7 == 0)) || ((num3 >= 0) && (num3 % 3 == 0)))
        {
          System.out.println("Correct!");
          System.out.println("You have cracked the code!");
        }
        else
        {
          System.out.println("Sorry, that was incorrect!");
          System.out.println("Better luck next time!");
        }
      }
      else
      {
        System.out.println("Sorry, that was incorrect!");
        System.out.println("Better luck next time!");
      }
    }
    else
    {
      System.out.println("Sorry, that was incorrect!");
      System.out.println("Better luck next time!");
    }
  }
}
