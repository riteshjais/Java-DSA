import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking total testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking n as input
            System.out.println(new Solution().fibonacci(n)); // print the nth fibonacci number
        }
    }
}

class Solution
{
    static int fibonacci(int n)
    {
        if(n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

