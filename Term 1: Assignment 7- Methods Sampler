import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
    String dup = console.nextLine();
    String newDup = duplicate(dup);
    System.out.println("The duplicated String is: " + newDup);
    System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
    String pal = console.nextLine();
    boolean palindrome = isEdhesivePalindrome(pal);
    if (palindrome == true)
    {
      System.out.println("Nice, you found an Edhesive Palindrome!");
    }
    else
    {
      System.out.println("Too bad, that isn't an Edhesive Palindrome.");
    }
    System.out.println("Almost done! Please enter a number to scramble.");
    double scram = console.nextDouble();
    System.out.println("The scrambled number is: " + numberScramble(scram));
  }
  public static String duplicate (String str)
  {
    int n = 0;
    if ((str.length() % 2) == 1)
    {
      n = str.length();
    }
    else
    {
      n = (str.length() * 2);
    }
    String createdString = "";
    for (int i = 0; i < str.length(); i++)
    {
      for (int j = 1; j <= n; j++)
      createdString += str.charAt(i);
    }
    return createdString;
  }
  public static boolean isEdhesivePalindrome (String str)
  {
    str = str.toUpperCase();
    if ((str.length() > 3) && (str.length() < 15))
    {
      String createdString = "";
      for (int i = 0; i <= str.length() - 1; i++)
      {
        if (str.charAt(i) == '4')
        {
          createdString += 'A';
        }
        else if (str.charAt(i) == '3')
        {
          createdString += 'E';
        }
        else if (str.charAt(i) == '0')
        {
          createdString += 'O';
        }
        else
        {
          createdString += str.charAt(i);
        }
      }
      for (int i = 0; i <= str.length() / 2; i++)
      {
        if (createdString.charAt(i) != createdString.charAt(createdString.length() - i - 1))
        {
          return false;
        }
      }
      return true;
    }
    else
    {
      return false;
    }
  }
  publicT static double numberScramble (double num)
  {
    if (num < 0)
    {
      return 0.0;
    }
    else 
    {
      double newNum = num + 5;
      newNum = newNum / 2;
      newNum = Math.sqrt(newNum);
      return newNum;
    }
  }
}
