public class ReverseTheWordsOfString{

    static void reverseWordsInString(String input) {
        // Split the input string into individual words based on spaces
        String[] wordArray = input.split(" ");

        // Initialize an empty string to hold the final reversed words
        String reversedSentence = "";

        // Loop through each word in the array
        for (String word : wordArray) {
            // Initialize an empty string to hold the reversed version of the current word
            String reversedWord = "";

            // Reverse the characters in the word by looping backward
            for (int k = word.length() - 1; k >= 0; k--) {
                reversedWord += word.charAt(k);
            }

            // Add the reversed word to the final string with a space
            reversedSentence += reversedWord + " ";
        }

        // Print the original input string
        System.out.println("Original String: " + input);

        // Print the string with each word reversed
        System.out.println("Reversed Words String: " + reversedSentence.trim());

        // Print a separator for clarity
        System.out.println("-------------------------");
    }



    public static void main(String[] args) {
        // Test the function with different input strings
        reverseWordsInString("Reverse Me");
    }
}

