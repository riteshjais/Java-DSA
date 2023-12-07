// There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

// You are giving candies to these children subjected to the following requirements:

// Each child must have at least one candy.
// Children with a higher rating get more candies than their neighbors.
// Return the minimum number of candies you need to have to distribute the candies to the children.

 

// Example 1:

// Input: ratings = [1,0,2]
// Output: 5
// Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
// Example 2:

// Input: ratings = [1,2,2]
// Output: 4
// Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
// The third child gets 1 candy because it satisfies the above two conditions.

// Input: ratings = [60,80,100,100,100]
// Output: 8
// Explanation: [1,2,3,1,1] (1+2+3+1+1=8)

// Input: ratings = [1,3,4,5,2]
// Output: 11
// Explanation: [1,2,3,4,1] 


class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int count[]=new int[n];
        count[0]=1;
        for(int i=1;i<n;i++){
            if(ratings[i-1]<ratings[i]){
                count[i]=count[i-1]+1;
            }
            else
                count[i]=1;
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i+1]<ratings[i])
                //This condition is so that count of max choc is
                //maintained
                count[i]=Math.max(count[i+1]+1,count[i]);
        }
        int sum=0;
        for(int i=0;i<count.length;i++){
            sum+=count[i];
        }
        return sum;

    }
}

// Do it in two directions.
// The first loop makes sure children with a higher rating get more candy than its left neighbor; 
// the second loop makes sure children with a higher rating get more candy than its right neighbor.
