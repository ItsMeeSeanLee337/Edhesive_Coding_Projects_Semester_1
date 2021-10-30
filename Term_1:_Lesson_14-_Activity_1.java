import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    System.out.println("Enter a number:");
    Scanner console = new Scanner (System.in);
    int user = console.nextInt();
    if ((user >= 5) && (user <=76))
    {
      System.out.println(user);
      System.out.println("False");
    }
    else
    {
      System.out.println(user);
      System.out.println("True");
    }
  }
}
