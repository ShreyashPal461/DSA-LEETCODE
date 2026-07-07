class Solution {
    public int maxSubArray(int[] arr) {
        int n =arr.length;
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<n;i++){
            currsum=Math.max(arr[i],currsum+arr[i]);
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
        
    }
}