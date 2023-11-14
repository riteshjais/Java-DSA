// Example 1:

// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// Example 2:

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

class Solution {
    public int removeDuplicates(int[] nums) {
        int curr=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[curr]){
                curr++;
                int temp=nums[i];
                nums[i]=nums[curr];
                nums[curr]=temp;
            }
        }
        return curr+1;
    }
}

// traverse the array and find non equal element and swap them. We maintain curr=0, 
// when we find non equal element(arr[i]!=arr[curr]), we curr++ and swap arr[i] and arr[curr]
