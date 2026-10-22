class NumArray {
    int[] prefix;

    public NumArray(int[] arr) {
        int n = arr.length;
        prefix = new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];

        }

    }
    public int sumRange(int left, int right) {
        if(left==0)
            return prefix [right];
            return prefix[right]-prefix[left-1];
        
        
    }
}

