class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letterCount = new int[26];

        for(int i=0; i<s.length(); i++){
            int ch = s.charAt(i) - 'a';
            letterCount[25 - ch]++;
        }

        for(int i=0; i<t.length(); i++){
            int ch = t.charAt(i) - 'a';
            letterCount[25 - ch]--;
            if(letterCount[25 - ch] < 0){
                return false;
            }
        }
        
        for(int i=0; i<s.length(); i++){
            int ch = s.charAt(i) - 'a';
            if(letterCount[25 - ch] != 0){
                return false;
            }
        }

        return true;
    }
}
