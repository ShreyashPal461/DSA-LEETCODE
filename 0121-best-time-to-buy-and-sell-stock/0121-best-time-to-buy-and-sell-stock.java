class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<n;i++){
            if(p[i]<minprice){
                minprice=p[i];
            }
            int price = p[i]-minprice;
            if(price>maxprofit){
                maxprofit=price;
            }
        }
            return maxprofit;
        }

}