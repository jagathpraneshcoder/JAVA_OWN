class Solution {

    static void sortArray(int[] arr){
        int minIndex=0;
        for(int i=0;i<arr.length-1;i++){
            minIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public int missingNumber(int[] nums) {
        Solution.sortArray(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }
}