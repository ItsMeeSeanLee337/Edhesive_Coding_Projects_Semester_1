import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    int user1 = console.nextInt();
    int user2 = console.nextInt();
    if ((user1 >=0) && (user2 >= 0)) 
    {
      System.out.println("Both are positive or zero.");
    }
    else
    {
      System.out.println("One or both are negative.");
    }
  }
}
