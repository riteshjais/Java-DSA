// Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. 
// An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
// For example, act and tac are an anagram of each other.

// Note:-

// If the strings are anagrams you have to return True or else return False

// |s| represents the length of string s.


// Example 1:

// Input:a = geeksforgeeks, b = forgeeksgeeks
// Output: YES
// Explanation: Both the string have same characters with
//         same frequency. So, both are anagrams.

  
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        if(a.length()!=b.length())
            return false;
        char[] countA=new char[256];
        for(int i=0;i<a.length();i++){
            countA[a.charAt(i)]++;
            countA[b.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(countA[i]!=0)
                return false;
        }
        return true;
        
    }
}

// Idea:
// First check both the string is of same length
// Then create a count character array of length 256
// use character as index in count array and incerement for first string and decrement for second string
// If both string are anagram then there should not be non zero character in count array, so check return ans accordingly
