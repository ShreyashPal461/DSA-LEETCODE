class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int totalsum=0;
        int n = arr.length;
        int currmax = arr[0];
        int maxsum = arr[0];
        int currmin = arr[0];
        int minsum=arr[0];
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
            if(i>0){
                currmax = Math.max(arr[i], currmax+arr[i]);
                maxsum = Math.max(currmax,maxsum);
                currmin = Math.min(arr[i], currmin+arr[i]);
                minsum = Math.min(currmin,minsum);
            }


        }
        if(maxsum<0)
            return maxsum;
            return Math.max(maxsum,totalsum-minsum);
        

        
    }
}