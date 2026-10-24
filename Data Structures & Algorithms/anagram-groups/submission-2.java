class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> hm = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String str = strs[i];

            List<Integer> charCount = new ArrayList<>(Collections.nCopies(26, 0));

            for(int j=0; j<str.length(); j++){
                int ch = str.charAt(j) - 'a';
                charCount.set(ch, charCount.get(ch) + 1);
            }

            if(hm.containsKey(charCount)){
                List<String> list = hm.get(charCount);
                list.add(str);
                hm.put(charCount, list);
            }else{
                List<String> list = new ArrayList<String>();
                list.add(str);
                hm.put(charCount, list);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for(List<String> list : hm.values()){
            result.add(list);
        }

        return result;
    }
}
