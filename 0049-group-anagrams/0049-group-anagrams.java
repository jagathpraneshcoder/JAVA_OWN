class Solution {

    public static String sorting(String t){
        char[] T=t.toCharArray();
        Arrays.sort(T);
        return new String(T);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();

        String sample="";
        for(String s:strs){
            sample=sorting(s);
            if(!m.containsKey(sample)){
                m.put(sample,new ArrayList<>());
            }
            m.get(sample).add(s);
        }
        return new ArrayList<>(m.values());
    }
}