class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!m.containsKey(c)){
                m.put(c,1);
            }
            else{
                m.put(c, m.getOrDefault(c,0) + 1 );
            }
        }
        PriorityQueue<Map.Entry<Character,Integer>> p = new PriorityQueue<>(
            (a,b) -> b.getValue() - a.getValue()
        );
        p.addAll(m.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!p.isEmpty()){
            Map.Entry<Character,Integer> single = p.poll();
            sb.append( String.valueOf( single.getKey() ).repeat(single.getValue())  );
        }
        return sb.toString();
    }
}