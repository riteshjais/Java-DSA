import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}

class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        if(N==1){
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            return 1;
        }
        
        long ans=toh(N-1,from,aux,to);
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        ans++;
        ans+=toh(N-1,aux,to,from);
        return ans;
    }
}
