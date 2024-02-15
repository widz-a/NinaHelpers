import java.util.Scanner;

public class CountsVowel {
    public static void main(String[] args) {
        // Basic stuff
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.next();

        // Count the number of vowels
        int vowelCount = 0;

        // Get each character from `text` by Looping through it,
        // don't forget to lower case it just to make it easier
        // because you won't need to include (c == 'U' || c == 'E' || c == 'O' || c == 'A' || c == 'I')
        // in the later if statement as it's no longer capitalized!
        for (int i = 0; i < text.length(); i++) {
            //get the char
            char ch = text.charAt(i);

            //lowercase the char
            char c = Character.toLowerCase(ch);
            if (c == 'u' || c == 'e' || c == 'o' || c == 'a' || c == 'i') {
                //It's a vowel!
                vowelCount++;
            }
        }

        //Display output:
        System.out.println("The number of vowels in " + text + " is: " + vowelCount);
    }
}
