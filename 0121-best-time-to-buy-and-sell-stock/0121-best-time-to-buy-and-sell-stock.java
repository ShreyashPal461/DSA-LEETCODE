class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(arr[i]<minprice){
                minprice=arr[i];
            }
            int price=arr[i]-minprice;
            if(price>maxprofit){
                maxprofit=price;
            }
        }
        return maxprofit;
        
    }
}

