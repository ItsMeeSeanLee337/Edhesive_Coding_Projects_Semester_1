import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("How long do you want the array?");
    int indices = console.nextInt();
    double total = 0;
    double average;
    double greatestArray;
    double leastArray;
    double sorted = 0;
    if (indices <= 0)
    {
      System.out.println("Not a valid length!");
    }
    else
    {
      double [] userArray = new double [indices];
      for (int i = 0; i <= indices - 1; i++)
      {
        System.out.println("Enter a number");
        userArray[i] = console.nextDouble();
        total += userArray[i];
      }
      greatestArray = userArray[0];
      leastArray = userArray[0];
      for (int i = 0; i <= indices - 1; i++)
      {
        if (userArray[i] >= greatestArray)
        {
          greatestArray = userArray[i];
        }
        else if (userArray[i] <= leastArray)
        {
          leastArray = userArray[i];
        }
      }
      System.out.print("Your array is {");
      for (int i = 0; i <= indices - 1; i++)
      {
        if (i == indices - 1)
        {
          System.out.print(userArray[i]);
        }
        else
        {
          System.out.print(userArray[i] + ", ");
        }
      }
      System.out.println("}");
      average = (total/indices);
      System.out.println("The average is " + average);
      System.out.println("The range is " + (greatestArray - leastArray));
      if (userArray[0] <= userArray[1])
      {
        sorted += userArray[0];
      }
      else if (userArray[0] >= userArray[1])
      {
        sorted -= userArray[0];
      }
      for (int i = 1; i <= indices - 1; i++)
      {
        if (userArray[i] >= userArray[i-1])
        {
          sorted += userArray[i];
        }
        else if (userArray[i] <= userArray[i-1])
        {
          sorted -= userArray[i];
        }
        if (i == indices - 1)
        {
          if (sorted == total)
          {
            System.out.println("The array is sorted in increasing order");
          }
          else if (sorted == (total * -1))
          {
            System.out.println("The array is sorted in decreasing order");
          }
          else if (sorted != total)
          {
            System.out.println("The array is unsorted");
          }
        }
      }
    }
  }
}
