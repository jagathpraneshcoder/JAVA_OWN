class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int res[] = new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            while(!s.empty() && s.peek()<nums2[i]){
                m.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        } 
        while(!s.empty()){
            m.put( s.pop() , -1 );
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=m.get(nums1[i]);
        }
        return res;
    }
}