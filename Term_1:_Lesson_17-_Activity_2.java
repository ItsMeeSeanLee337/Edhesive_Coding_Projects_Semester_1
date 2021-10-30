import java.util.Scanner;
class Main
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Enter two numbers:");
    int num1 = console.nextInt();
    int num2 = console.nextInt();
    while (num1 <= num2)
    {
      if ((num1 % 2) == 0)
      {
        System.out.print(num1 + " ");
      }
      num1++;
    }
  }
}
