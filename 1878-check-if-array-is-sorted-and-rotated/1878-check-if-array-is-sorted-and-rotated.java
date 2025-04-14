class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n==1) return true;
        int count = 1;
        for(int i=1;i<2*n;i++){
            if(count == n){
                return true;
            }
            else if(nums[(i-1)%n]<=nums[i%n]){
                count++;
            }
            else{
                count = 1;
            }
        }
            return false;
    }
}