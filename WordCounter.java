import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        // Get the sentence from the user
        String sentence = getSentenceInput();

        // Count the number of words in the sentence
        int wordCount = countWords(sentence);

        // Display the result to the user
        System.out.println("The sentence has " + wordCount + " words.");
    }

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to read input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine(); // Read the entire line of input
        return sentence;
    }

    // Method to count the number of words in the sentence
    public static int countWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");

        // Return the number of words in the sentence
        return words.length;
    }
}
