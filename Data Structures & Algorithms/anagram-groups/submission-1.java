class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            int[] freq = new int[26];
            for(int j=0; j<str.length(); j++){
                freq[str.charAt(j) - 'a']++;
            }

            String freqString = Arrays.toString(freq);
            if(hm.containsKey(freqString)){
                List<String> list = hm.get(freqString);
                list.add(str);
                hm.put(freqString, list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                hm.put(freqString, list);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for(List<String> list : hm.values()){
            result.add(list);
        }

        return result;

    }
}
