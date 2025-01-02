class Solution {
    
    public int lowerBound(int[] nums,int target){
        int i=0,j=nums.length-1;
        int mid=0;
        int lb=nums.length;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]>=target){
                lb=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return lb;
    }

    public int upperBound(int[] nums,int target){
        int i=0,j=nums.length-1;
        int mid=0;
        int ub=nums.length;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]>target){
                ub=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ub;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int lb=lowerBound(nums,target);
        System.out.println(lb);
        if(lb==nums.length || nums[lb]!=target)
            return new int[]{-1,-1};
        int ub=upperBound(nums,target);
        return new int[]{lb,ub-1};
    }
}