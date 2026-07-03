class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int totalsum=0;
        for(int num : arr){
            totalsum+=num;
        }
        int rigtsum=0;
        int leftsum=0;
        for(int i=0;i<n;i++){
            totalsum-=arr[i];
            if(leftsum==totalsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
        
    }
}