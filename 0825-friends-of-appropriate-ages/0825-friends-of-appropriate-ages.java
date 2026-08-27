class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age: ages){
            count[age]++;
        }
        int ans=0;
        for(int x=1;x<=120;x++){
            if(count[x]==0)
            continue;
            int minage=x/2+7;

        for(int y=minage+1;y<=x;y++){
            if(count[y]==0)
            continue;
            ans+=count[x]*count[y];
            if(x==y){
                ans-=count[x];
            }
        }    
    }
        return ans;
        
    }
}