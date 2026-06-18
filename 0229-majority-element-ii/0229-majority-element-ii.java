class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0, count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int num:nums){
            if(count1==0 && ele2!=num){
                count1=1;
                ele1=num;
            }else if(count2==0 && ele1!=num){
                count2=1;
                ele2=num;
            }
            else if(num==ele1){
                count1++;
            }
            else if(num==ele2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num : nums){
            if(num==ele1) count1++;
            if(num==ele2) count2++;
        }
        List<Integer> ans = new ArrayList<>();
        int mini = nums.length/3+1;
        if(count1 >= mini) ans.add(ele1);
        if(count2 >= mini) ans.add(ele2);

        Collections.sort(ans);
        return ans;
    }
}