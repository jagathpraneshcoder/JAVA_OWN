class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        int freq=0;
        for(int i=0;i<n;i++){
            freq+=m.getOrDefault(nums[i],0);
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        return freq;
    }
}