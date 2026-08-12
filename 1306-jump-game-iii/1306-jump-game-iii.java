class Solution {
    public boolean canReach(int[] arr, int start) {

        boolean[] visited = new boolean[arr.length];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {

            int index = queue.poll();

            if (arr[index] == 0) {
                return true;
            }

            int right = index + arr[index];
            int left = index - arr[index];

            if (right < arr.length && !visited[right]) {
                queue.add(right);
                visited[right] = true;
            }

            if (left >= 0 && !visited[left]) {
                queue.add(left);
                visited[left] = true;
            }
        }

        return false;
    }
}