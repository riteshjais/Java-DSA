// You are given a number n. You need to see if the number is a palindrome or not (recursively)
// Input:
// n = 100
// Output: 0

  
import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Solution().isPalin(n)?1:0);
        }
    }
}

class Solution
{
    // Complete the function
    // N: input element
    static boolean isPalin(int N)
    {
        String number=Integer.toString(N);
        return checkPalindrome(number,0,number.length()-1);
        
    }
    static boolean checkPalindrome(String n, int l, int h){
        if(l>=h)
            return true;
        return (n.charAt(l)==n.charAt(h)) && checkPalindrome(n,l+1,h-1);
    }
    
}
