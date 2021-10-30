import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Enter the Scores:");
    double sum = 1;
    int total = -1;
    double testscore = 0;
    while (testscore != -1)
    {
      testscore = console.nextInt();
      sum += testscore;
      total++;
    }
    double average1 = (double)(sum/total);
    System.out.println("The average is: " + average1);
  }
}
