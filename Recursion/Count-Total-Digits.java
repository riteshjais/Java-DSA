
import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n =sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().countDigits(n)); // prints the count of digits 
        }
    }
}



class Solution
{
    // complete the below function
    public static int countDigits(int n)
    {
        if(n==0)
            return 0;
        return countDigits(n/10)+1;
    }
}

