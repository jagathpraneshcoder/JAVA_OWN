class Solution {
     public static void reverse(int[] nums,int i,int k){
        int j = k -1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[ j];
            nums[j] = temp;
            i++;
            j--;
        }
    }   
    public void print(int[] nums){
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);
    }
}