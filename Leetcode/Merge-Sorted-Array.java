// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, 
// but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
// where the first m elements denote the elements that should be merged, and the last n elements are set to 0 
// and should be ignored. nums2 has a length of n.

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.



  
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i=0,j=0,k=0;
        // int ans[]=new int[m+n];
        // while(i<m && j<n){
        //     if(nums1[i]<nums2[j]){
        //         ans[k++]=nums1[i++];
        //     }
        //     else{
        //         ans[k++]=nums2[j++];
        //     }
        // }
        // while(i<m){
        //     ans[k++]=nums1[i++];
        // }
        // while(j<n)
        //     ans[k++]=nums2[j++];
        // for(i=0;i<(m+n);i++)
        //     nums1[i]=ans[i];

        //The above code takes O(m+n) time and O(n) space 

        int i=m-1, j=n-1,k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j])
                nums1[k--]=nums1[i--];
            else
                nums1[k--]=nums2[j--];
        }

        //Above code uses O(m+n) time ans O(1) space
        //We start from last index and compare and find the larger
        //element, the we shift this element at last of nums1[]
    }
}
