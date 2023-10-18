// You are given two numbers n and r. You need to find nCr.
// nCr = (n!) / ((n-r)!*(r!))
// In recursive way, we can write nCr as nCr = (n-1)C(r-1) + (n-1)Cr

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
            String str[] = read.readLine().trim().split(" ");
            int n  =Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);
            
            Get obj = new Get();
            System.out.println(obj.nCr(n, r));
        }
    }
}



class Get
{
    public static int nCr(int n,int r)
    {
        if(r==0 || r==n) //According to formula nC0 and nCn == 1
            return 1;
        return nCr(n-1,r-1)+nCr(n-1,r);
        
    }
}
