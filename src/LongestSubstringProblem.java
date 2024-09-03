    import java.util.HashMap;
    class LongestSubstringProblem {
     static int findLongestUniqueSubstring(String input) {
         int length = input.length();
         int maxLength = 0; // to store the length of the longest unique substring
         int start = 0; // starting index of the current window
         // HashMap to store the most recent positions of each character

         HashMap<Character,Integer> recentPosition = new HashMap<>();
        // Traverse through the string
         for (int end = 0; end < length; end++)
         {
    char currentChar = input.charAt(end);

      // If the character is already in the map, move the start index
    if (recentPosition.containsKey(currentChar)) {
    start = Math.max(start, recentPosition.get(currentChar) + 1);
    }
    // Update the maximum length if the current window is larger
    maxLength = Math.max(maxLength, end - start + 1);
    // Update the most recent position of the current character
    recentPosition.put(currentChar, end);
    }
    return maxLength;
     }

     // Main method to test the function
    public static void main(String[] args)
    {
    String example1 = "ABCDEFG";
    System.out.println("Length of the longest unique substring: " + findLongestUniqueSubstring(example1));

       String example2 = "AMANKUMAR";
    System.out.println("Length of the longest unique substring: " + findLongestUniqueSubstring(example2));
    }

    }