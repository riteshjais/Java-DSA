// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.

 

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
Explanation: The last word is "moon" with length 4.

class Solution {
    public int lengthOfLastWord(String s) {
        // String[] words=s.trim().split("\\s+");
        // String lastWord=new String(words[words.length-1]);
        // return lastWord.length();

      
        // Idea for Method 1
        // Method 1
        // Split the string into words retrieve the last word and return its length

      
        //Alternative Method
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { 
                length++;
            } else {
                if (length > 0) return length;
            }
        }
        return length;
    }
}
//Idea for Method 2
// We need to find length of last word
// So we start from last of string and do length++ untill we find space
// To handle extra space at last of sentence we put that else condition
