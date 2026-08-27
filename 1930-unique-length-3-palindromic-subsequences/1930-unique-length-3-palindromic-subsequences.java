class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> firstMap = new HashMap<>();
        HashMap<Character,Integer> lastMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!firstMap.containsKey(ch)) firstMap.put(ch,i);
            lastMap.put(ch,i);
        }
        int count=0;
        for(char ch  :firstMap.keySet()){
            int firstidx = firstMap.get(ch);
            int lastidx = lastMap.get(ch);
            HashSet<Character> set = new HashSet<>();
            for(int i=firstidx+1;i<=lastidx-1;i++){
                set.add(s.charAt(i));

            } 
            count+=set.size();
        }
        return count;
    }
}