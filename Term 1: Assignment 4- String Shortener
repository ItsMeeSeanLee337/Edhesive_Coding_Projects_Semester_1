import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Type the message to be shortened");
    String userInput = console.nextLine();
    int vowelNumber = 0;
    int totalCharacters = userInput.length();
    String initialString = ""; 
    String finalString = "";
    int charactersSaved = 0;
    int repeatedLetters = 0;
    if ((userInput.length()) < 10)
    {
      System.out.println("This doesn't need shortening!");
    }
    else
    {
      userInput.toLowerCase();
      for (int characterPointer = 0; characterPointer <= (userInput.length()-1); characterPointer++)
      {
        if ((userInput.charAt(characterPointer) == 'a') && (characterPointer != 0) && (userInput.charAt(characterPointer-1) != ' '))
        {
          vowelNumber++;
          charactersSaved++;
        }
        else if ((userInput.charAt(characterPointer) == 'e') && (characterPointer != 0) && (userInput.charAt(characterPointer-1) != ' '))
        {
          vowelNumber++;
          charactersSaved++;
        }
        else if ((userInput.charAt(characterPointer) == 'i') && (characterPointer != 0) && (userInput.charAt(characterPointer-1) != ' '))
        {
          vowelNumber++;
          charactersSaved++;
        }
        else if ((userInput.charAt(characterPointer) == 'o') && (characterPointer != 0) && (userInput.charAt(characterPointer-1) != ' '))
        {
          vowelNumber++;
          charactersSaved++;
        }
        else if ((userInput.charAt(characterPointer) == 'u') && (characterPointer != 0) && (userInput.charAt(characterPointer-1) != ' '))
        {
          vowelNumber++;
          charactersSaved++;
        }
        else
        {
          initialString += userInput.charAt(characterPointer);
        }
      }
      for (int characterPointer = 0; characterPointer <= (initialString.length()-1); characterPointer++)
      {
        if ((characterPointer != 0) && (initialString.charAt(characterPointer)) == (initialString.charAt(characterPointer-1)))
        {
          repeatedLetters++;
          charactersSaved++;
        }
        else
        {
          finalString += initialString.charAt(characterPointer);
        }
      }
      finalString = finalString.toLowerCase();
      System.out.println("Shortened message: " + finalString);
      System.out.println("Repeated letters removed: " + repeatedLetters);
      System.out.println("Vowels removed: " + vowelNumber);
      System.out.println("Total characters saved: " + charactersSaved);
    }  
  }
}
