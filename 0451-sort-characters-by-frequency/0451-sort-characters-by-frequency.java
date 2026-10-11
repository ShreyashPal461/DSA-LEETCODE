class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Store characters in a list
        List<Character> list = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency (highest first)
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Build the answer
        StringBuilder result = new StringBuilder();

        for (char ch : list) {
            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
