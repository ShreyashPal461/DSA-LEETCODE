class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int currmax=arr[0];
        int currmin=arr[0];
        int maxproduct=arr[0];
        for(int i=1;i<n;i++){
            int temp = currmax;
            currmax=Math.max(arr[i],Math.max(currmax * arr[i],currmin* arr[i]));
            currmin=Math.min(arr[i],Math.min(temp*arr[i],currmin*arr[i]));
            maxproduct = Math.max(maxproduct,currmax);
        }
        return maxproduct;
        
    }
}