class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] count = new int[10];

        // Count each digit
        for (int d : digits) {
            count[d]++;
        }

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        // First digit: 1 to 9
        for (int i = 1; i <= 9; i++) {

            // Second digit: 0 to 9
            for (int j = 0; j <= 9; j++) {

                // Last digit must be even
                for (int k = 0; k <= 8; k += 2) {

                    int[] used = new int[10];

                    used[i]++;
                    used[j]++;
                    used[k]++;

                    boolean possible = true;

                    for (int d = 0; d <= 9; d++) {
                        if (used[d] > count[d]) {
                            possible = false;
                            break;
                        }
                    }

                    if (possible) {
                        list.add(i * 100 + j * 10 + k);
                    }
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}