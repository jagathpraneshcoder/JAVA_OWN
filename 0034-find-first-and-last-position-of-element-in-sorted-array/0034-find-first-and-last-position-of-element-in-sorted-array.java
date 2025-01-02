class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=Integer.MIN_VALUE,last=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==Integer.MIN_VALUE)
                    first=i;
                last=i;
            }            
        }
        if(first==Integer.MIN_VALUE || last==Integer.MIN_VALUE)
            return new int[]{-1,-1};  
        return new int[]{first,last};
    }
}