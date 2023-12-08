// You are given an integer array height of length n. There are n vertical lines drawn such that the 
// two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
// In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:

// Input: height = [1,1]
// Output: 1


class Solution {
    
    public int maxArea(int[] height) {
        int n=height.length;
        int low=0,high=n-1;
        int res=0;
        while(low<high){
            int area=Math.min(height[low],height[high])*(high-low);
            res=Math.max(area,res);
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return res;
    }

    //Two Pointers approach
    
}






// We use Two pointers approach. We maintain low and high pointer
// calculate area considering min bar between low and high.
// To move forward we compare which bar is minimum and move 
// in that direction
