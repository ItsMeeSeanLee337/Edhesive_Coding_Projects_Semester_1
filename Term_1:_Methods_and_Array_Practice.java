import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Enter size of array");
    int sizeOfArray = console.nextInt();
    int[] userArray = new int[sizeOfArray];
    for (int i = 0; i < sizeOfArray; i++)
    {
      userArray[i] = (int)((Math.random() * 100) + 1);
    }
    System.out.println("Max: " + findMax(userArray));
    System.out.println("Min: " + findMin(userArray));
    System.out.println("Sum: " + findSum(userArray));
    System.out.println("Average: " + findAverage(findSum(userArray), sizeOfArray));
    System.out.println("Choose 0 to see whole array or enter the number of values you would like to see:");
    int check = console.nextInt();
    if (check == 0)
    {
      printArray(userArray);
    }
    else
    {
      printArray(userArray, check);
    }
  }
  public static int findMax (int[] a)
  {
    int max = 0;
    for (int i = 0; i < a.length; i++)
    {
      if (a[i] >= max)
      {
        max = a[i];
      }
    }
    return max;
  }
  public static int findMin (int[] a)
  {
    int min = 100;
    for (int i = 0; i < a.length; i++)
    {
      if (a[i] <= min)
      {
        min = a[i];
      }
    }
    return min;
  }
  public static int findSum (int[] a)
  {
    int sum = 0;
    for (int i = 0; i < a.length; i++)
    {
      sum += a[i];
    }
    return sum;
  }
  public static double findAverage (int sum, int count)
  {
    int average = (sum / count);
    return average;
  }
  public static void printArray (int[] a)
  {
    System.out.print("{ ");
    for (int i = 0; i < a.length; i++)
    {
      System.out.print(a[i] + ", ");
    }
    System.out.println("}");
  }
  public static void printArray (int[] a, int b)
  {
    System.out.print("{ ");
    for (int i = 0; i < b; i++)
    {
      System.out.print(a[i] + ", ");
    }
    System.out.println("}");
  }
}
