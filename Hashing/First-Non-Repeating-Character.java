// Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.
// Input:
// S = hello
// Output: h
// Explanation: In the given string, the
// first character which is non-repeating
// is h, as it appears first and there is
// no other 'h' in the string.

  
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
       HashMap<Character,Integer> map=new LinkedHashMap<>();
       for(int i=0;i<S.length();i++){
           char c=S.charAt(i);
           map.put(c,map.getOrDefault(c,0)+1);
       }
       for(Map.Entry<Character, Integer> element:map.entrySet()){
           if(element.getValue()==1)
                return element.getKey();
       }
       return '$';
    }
}

