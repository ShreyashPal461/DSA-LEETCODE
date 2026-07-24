class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;

        }
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int idx = i%n;
            while(!st.isEmpty() && st.peek()<=arr[idx]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[idx]=st.peek();

            }
            st.push(arr[idx]);
        }
         return ans;
    }
}