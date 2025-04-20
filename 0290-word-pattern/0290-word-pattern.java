class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map <Character,String> map = new HashMap<>();
        String[] words = s.split("\\s+");
        if(pattern.length() != words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                String word = words[i];
                if(!word.equals(map.get(pattern.charAt(i)))){
                    return false;
                }
            }
            else if(map.containsValue(words[i])){
                String word = words[i];
                if(!word.equals(map.get(pattern.charAt(i)))){
                    return false;
                }
            }
            map.put(pattern.charAt(i),words[i]);
        }
        return true;
    }
}