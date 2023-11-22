// You are given an integer array nums. You are initially positioned at the array's first index, 
// and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

  

class Solution {
    public boolean canJump(int[] nums)
    {
        int n=nums.length;
         int last=n-1,i,j;
        for(i=n-2;i>=0;i--)
        {
            if(i+nums[i]>=last)last=i;
        }
        return last<=0;
        
    }
}


// Idea is to work backwards from the last index. 
// Keep track of the smallest index that can "jump" to the last index.
// Check whether the current index can jump to this smallest index.
