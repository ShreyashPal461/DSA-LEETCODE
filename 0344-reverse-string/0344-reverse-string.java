class Solution {
    public void reverseString(char[] s) {
        char[] arr = s;
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
    }
}