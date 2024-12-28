class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(m.containsKey(target-num)){
                return new int[]{m.get(target-num),i};
            }
            m.put(num,i);
        } 
        return new int[]{};      
    }
}