import java.util.Scanner;
class Main 
{
  public static int sum (int[] a)
  {
    int sum = 0;
    for (int i = 0; i <= a.length - 1; i++)
    {
      sum += a[i];
    }
    return sum;
  } 
}
