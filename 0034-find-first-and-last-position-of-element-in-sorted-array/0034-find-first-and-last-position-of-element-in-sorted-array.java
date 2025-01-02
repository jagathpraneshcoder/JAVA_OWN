class Solution {
    
    public int binarySearch(boolean flag,int[] nums,int target){
        int left=0,right=nums.length-1;
        int res=-1;
        int mid = (left+right)/2;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                res=mid;
                if(flag)
                    right=mid-1;
                else
                    left=mid+1;

            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return res;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(true,nums,target);
        if(first==-1)
            return new int[]{-1,-1};
        int last = binarySearch(false,nums,target);
        //System.out.println(first+" "+last);
        return new int[]{first,last};
    }
}