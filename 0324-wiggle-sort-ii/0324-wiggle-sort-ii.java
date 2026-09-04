class Solution {
    public void wiggleSort(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int j = (n+1)/2-1;
        int k = n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=temp[j--];
            }else{
                arr[i]=temp[k--];
            }
        }    
    }
}