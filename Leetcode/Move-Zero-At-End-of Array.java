// Given an integer array nums, move all 0's to the end of it 
// while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

class Solution {
    public void moveZeroes(int[] nums) {
        int currZero=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[currZero];
                nums[currZero]=temp;
                currZero++;
            }
        }
    }
}

// We maintain currZero=0, we traverse array and whenever we find non zero element  
// we swap arr[i] , arr[currZero] then currZero++;
