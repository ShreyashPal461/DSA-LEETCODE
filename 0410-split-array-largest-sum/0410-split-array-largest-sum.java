class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int lo=0;
        int hi=0;
        for(int num : nums){
            lo=Math.max(lo,num);
            hi+=num;
        }
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            int parts=1;
            int sum=0;
            for(int num : nums){
                if(sum+num>mid){
                    parts++;
                    sum=num;
                }else{
                    sum+=num;
                }
            }
            if(parts<=k){
                hi=mid;
            }else{
                lo=mid+1;
            }


        }
        return lo;
        
    }
}