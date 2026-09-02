class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
            if(map.get(num)>n/2){
                return num;

            }
        }
        return -1;
        
    }
}


// class Solution {
//     public int majorityElement(int[] nums) {
//       int count =0;
//       int ele = 0;
//       for(int num : nums){
//         if(count==0){
//             ele=num;
//         }
//         if(num==ele){
//             count++;
//         }else{
//             count--;
//         }
//       }
//       return ele;  
//     }
// }