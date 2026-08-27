import java.util.*;

class Solution {
    public int beautySum(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                // Increase frequency
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                // Substring length >= 3
                if (j - i + 1 >= 3) {

                    int max = 0;
                    int min = Integer.MAX_VALUE;

                    for (char c : map.keySet()) {

                        int freq = map.get(c);

                        max = Math.max(max, freq);
                        min = Math.min(min, freq);
                    }

                    count += max - min;
                }
            }
        }

        return count;
    }
}