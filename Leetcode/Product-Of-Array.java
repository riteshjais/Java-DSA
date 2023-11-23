// Given an integer array nums, return an array answer such that answer[i] is equal to 
// the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int lm[]=new int[n];
        int rm[]=new int[n];
        int mul=1;
        for(int i=0;i<n;i++){
            lm[i]=mul;
            mul*=nums[i];
            
        }
        mul=1;
        for(int i=n-1;i>=0;i--){
            rm[i]=mul;
            mul*=nums[i];
            
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=lm[i]*rm[i];
        }
        return ans;

    }
}

  
// Maintain two array, consisting of product of all the element in the left, 
// and product of all the element in the right excluding the element in both the cases
// then in the ans array , ans will be lm[i]*rm[i] 
