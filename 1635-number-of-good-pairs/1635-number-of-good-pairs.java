class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int freq=map.getOrDefault(nums[i],0);
            map.put(nums[i],freq+1);
        }
        for(int occur : map.values()){
            count+=(occur*(occur-1)/2);
        }
        return count;
    }
}