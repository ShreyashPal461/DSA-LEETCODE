class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            int index = -1;
            for(int j = 0; j < m; j++) {
                if(nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }
            result[i] = -1;
            for(int j = index + 1; j < m; j++) {
                if(nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }

        return result;
    }
}