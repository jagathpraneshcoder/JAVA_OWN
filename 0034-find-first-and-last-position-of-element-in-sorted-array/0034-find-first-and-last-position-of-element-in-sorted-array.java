class Solution {
    
    public int binarySearchFirst(int[] nums,int target){
        int left=0,right=nums.length-1;
        int res=-1;
        int mid = (left+right)/2;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                res=mid;
                right=mid-1;
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

    public int binarySearchLast(int[] nums,int target){
        int left=0,right=nums.length-1;
        int res=-1;
        int mid = (left+right)/2;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                res=mid;
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
        int first = binarySearchFirst(nums,target);
        if(first==-1)
            return new int[]{-1,-1};
        int last = binarySearchLast(nums,target);
        //System.out.println(first+" "+last);
        return new int[]{first,last};
    }
}