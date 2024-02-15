import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        //Declare variables
        String greatest = null, least = null;
        int r=0,s=0,a=0;

        //Declare scanner
        Scanner scanner = new Scanner(System.in);

        //This is a loop, since the program only stops when user enters 1
        while (true) {
            //As usual, get user's input!
            String word = scanner.nextLine();

            //As stated above, the program stops and prints out result if user inputs 1
            if (word.equals("1")) {
                System.out.println("The word with the greatest number of characters: " + greatest);
                System.out.println("The word with the least number of characters: " + least);
                System.out.println("The number of words that starts with the letter \"r\": " + r);
                System.out.println("The number of words that ends with the letter \"s\": " + s);
                System.out.println("The number of words that have an \"a\" as the second letter: " + a);
                break;
            }

            //the word with the greatest number of characters
            if (greatest == null || greatest.length() < word.length()) {
                greatest = word;
            }

            //the word with the least number of characters
            if (least == null || least.length() > word.length()) {
                least = word;
            }

            //• the number of words that start with the letter “r”
            if (word.startsWith("r")) {
                r++;
            }

            //• the number of words that end with the letter “s”
            if (word.endsWith("s")) {
                s++;
            }

            //• the number of words that have an “a” as the second letter
            if (word.charAt(1) == 'a') {
                a++;
            }

            // Note: "a" is a string while 'a' is a char!
        }
    }
}
