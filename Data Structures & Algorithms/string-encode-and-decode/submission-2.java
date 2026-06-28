class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(int i=0; i<strs.size(); i++){
            if(strs.get(i).length() > 0){
                str += strs.get(i) + "/n";
            }else{
                str += "/e";
            }
        }
        return str;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        String word = "";
        for(int i=0; i<str.length(); i++){
            if(i < str.length()-1 && str.charAt(i) == '/' && str.charAt(i+1) == 'n'){
                i++;
                list.add(word);
                word = "";
            }else if(i < str.length()-1 && str.charAt(i) == '/' && str.charAt(i+1) == 'e'){
                i++;
                list.add("");
                word = "";
            }else{
                word += str.charAt(i);
            }
        }
        if(word != ""){
            list.add(word);
        }
        return list;
    }
}
