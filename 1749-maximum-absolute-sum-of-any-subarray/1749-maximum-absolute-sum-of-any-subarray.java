class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int totalsum=0;
        int n = arr.length;
        int currmax=arr[0];
        int maxsum=arr[0];
        int currmin=arr[0];
        int minsum=arr[0];
        for(int i=1;i<n;i++){
            currmax=Math.max(arr[i],currmax+arr[i]);
            maxsum=Math.max(currmax,maxsum);
            currmin=Math.min(arr[i],currmin+arr[i]);
            minsum=Math.min(currmin,minsum);

        }
        return Math.max(maxsum, -minsum);
        
    }
}