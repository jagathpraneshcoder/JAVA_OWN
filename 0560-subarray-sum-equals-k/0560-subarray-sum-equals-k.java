class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            prefixSum += nums[i];
            int rem = prefixSum - k;
            count += map.getOrDefault(rem,0);
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);        
        }
        return count;
    }
}