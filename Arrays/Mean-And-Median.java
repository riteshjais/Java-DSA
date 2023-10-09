import java.io.*;
import java.util.*;
class Mathematics {
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();
		
		//looping testcase
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //number of elements in array
		    N=sc.nextInt();
		    int a[]=new int [N];
		    
		    //inseting elements in the array
		    for(int i=0;i<N;i++)
		    {
		        int x=sc.nextInt();
		        a[i]=x;
		    }
		    
		    //calling mean() and median() functions
		    System.out.println(obj.mean(a,N)+" "+obj.median(a,N));
		   
		    
		}
		
	}
}






class Solution
{
 
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       if(N%2==0){
           return (int) Math.floor((A[N/2]+A[(int)(N/2)-1])/2);
       }
       else
        return A[N/2];

    }
    public int mean(int A[],int N)
    {
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        return sum/N;

    }

}

