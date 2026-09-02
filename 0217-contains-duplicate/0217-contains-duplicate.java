class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                return true;
            }else{
                map.put(num,1);
            }
        }
        return false;
    }
}
