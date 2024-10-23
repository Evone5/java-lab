package evone;
import java.util.Scanner;

public class CharacterFequency {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("Enter a string: ");
    String inputString = scanner.nextLine();
    
    
    System.out.print("Enter the character to find its frequency: ");
    char character = scanner.next().charAt(0);
    
    
    int frequency = findCharacterFrequency(inputString, character);
    
    
    System.out.println("The frequency of '" + character + "' in the string is: " + frequency);
    
    
    scanner.close();
}

public static int findCharacterFrequency(String inputString, char character) {
    int count = 0;
    
    
    String lowerCaseString = inputString.toLowerCase();
    char lowerCaseChar = Character.toLowerCase(character);

  
    for (int i = 0; i < lowerCaseString.length(); i++) {
        if (lowerCaseString.charAt(i) == lowerCaseChar) {
            count++;
        }
    }
    
    return count;
}



}


}
