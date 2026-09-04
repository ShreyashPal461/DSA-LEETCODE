class Solution {
    public boolean canPlaceFlowers(int[] arr, int k) {

        if (k == 0) {
            return true;
        }

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {

                if ((i == 0 || arr[i - 1] == 0) &&
                    (i == n - 1 || arr[i + 1] == 0)) {

                    arr[i] = 1;
                    k--;

                    if (k == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}