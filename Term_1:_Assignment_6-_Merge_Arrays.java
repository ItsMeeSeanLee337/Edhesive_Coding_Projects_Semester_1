import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    int arrayLength = 0;
    int pass = 1;
    System.out.println("Enter an array length (must be 10 or greater): ");
    arrayLength = console.nextInt();
    if (arrayLength <= 10)
    {
      pass = 0;
    }
    while (pass != 1)
    {
      System.out.println("Enter an array length (must be 10 or greater): ");
      arrayLength = console.nextInt();
      if (arrayLength >= 10)
      {
        pass = 1;
      }
    }
    System.out.print("First Array: ");
    int [] firstArray = new int [arrayLength];
    for (int i = 0; i <= arrayLength - 1; i++)
    {
      firstArray[i] = (int)(Math.random() * 100);
      System.out.print(firstArray[i] + " ");
    }
    System.out.println();
    System.out.print("Second Array: ");
    int [] secondArray = new int [arrayLength];
    for (int i = 0; i <= arrayLength - 1; i++)
    {
      secondArray[i] = (int)(Math.random() * 100);
      System.out.print(secondArray[i] + " ");
    }
  }
}
