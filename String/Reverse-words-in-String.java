// Input:
// S = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole
// string(not individual words), the input
// string becomes
// much.very.program.this.like.i


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] words=S.split("\\.");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]);
            if(i!=0)
                res.append(".");
        }
        return res.toString();
    }
    
    
    // Alternative Method
    //     int start=0;
    //     for(int end=0;end<S.length();end++){
    //         if(S.charAt(end) == '.'){
    //             reverse(S,start,end-1);
    //             start=end+1;
    //         }
    //     }
    //     reverse(S,start,S.length()-1);
    //     reverse(S,0,S.length()-1);
    //     return S;
    // }
    // void reverse(String S, int l,int h){
    //     char[] c=S.toCharArray();
    //     while(l<h){
    //         char temp=c[l];
    //         c[l]=c[h];
    //         c[h]=temp;
    //         l++;
    //         h--;
    //     }
    //     S=new String(c);
    // }
}
