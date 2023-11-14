// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 2

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                count++;
            else{
                res=Math.max(res,count);
                count=0;
            }
        }
        res=Math.max(res,count);
        return res;
    }
}

// We maintain a count=0,res=0, if we encounter 1 we count++, else Math.max(res,count) and set count=0;
// at last also we check Math.max(count,res) 
// so we don't miss the last element count.
