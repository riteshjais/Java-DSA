// Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.
// Example 1:

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
// Example 2:

// Input: nums = [0,1]
// Output: 2
// Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
// 2 is the missing number in the range since it does not appear in nums.

class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++)
            sum+=nums[i];
        int totalSum=(n*(n+1))/2;
        return totalSum-sum;
    }
}

// We use Total Sum technique, we calculate the total sum of numbers b/w 0 to n 
// then we calculate sum of elements of array, our ans is TotalSum-sumOfArray
