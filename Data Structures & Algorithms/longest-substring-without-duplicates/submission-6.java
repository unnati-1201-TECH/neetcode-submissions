class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();

        int size = 0;
        int maxSize = 0;

        int start = 0;

        for(int i=0; i<s.length(); i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(start));
                start++;
            }
            size = i - start + 1;
            hs.add(s.charAt(i));
            maxSize = Math.max(size, maxSize);
        }

        return maxSize;
    }
}
