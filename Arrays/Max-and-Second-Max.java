// Solution class to implement function largestAndSecondLargest
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        ArrayList<Integer> ans=new ArrayList<>();
        int largest=0, sl=-1;
        for(int i=1;i<sizeOfArray;i++){
            if(arr[i]>arr[largest]){
                sl=largest;
                largest=i;
            }
            else if(arr[largest]>arr[i]){
                if(sl==-1||arr[i]>arr[sl])
                    sl=i;
            }
        }
        ans.add(arr[largest]);
        if(sl==-1)
        ans.add(sl);
        else
            ans.add(arr[sl]);
        return ans;
    }
}
