class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n = arr.length;
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        long maxsum=sum;
        for(int i=k;i<n;i++){
            sum+= arr[i]-arr[i-k];
            maxsum=Math.max(maxsum,sum);

        }
        return (double) maxsum/k;
        
    }
}