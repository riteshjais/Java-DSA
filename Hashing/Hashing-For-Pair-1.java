// You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array.
// Input:
// N = 10
// arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
// sum = 14
// Output: 
// 1
// Explanation: 
// arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
// and sum = 14.  There is a pair {4, 10} 
// with sum 14.

import java.util.*;
import java.io.*;

class Gfg {
    public static void main(String[] args) {

        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking count of testcases
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            // taking size of array
            int N = sc.nextInt();
            int arr[] = new int[N]; // array declaration

            for (int i = 0; i < N; i++) arr[i] = sc.nextInt(); // Input the
                                                               // array

            int sum = 0;

            // taking sum
            sum = sc.nextInt();

            // Creating an object of class Geeks
            Geeks obj = new Geeks();

            // Calling sumExists method of class Geeks
            // and printing the result
            System.out.println(obj.sumExists(arr, N, sum));
        }
    }
}

class Geeks {
    // Complete this function
    // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int N, int sum) {
        HashSet<Integer> h=new HashSet<>();
        for(int element:arr){
            if(h.contains(sum-element))
                return 1;
            h.add(element);
        }
        return 0;
    }
}
