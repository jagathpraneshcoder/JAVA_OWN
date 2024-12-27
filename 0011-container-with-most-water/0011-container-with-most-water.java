class Solution {
    public int maxArea(int[] arr) {
        int i = 0 , j = arr.length-1;
        int maxArea = 0 , height = 0,width = 0;
        while(i<j){
            height = Math.min(arr[i],arr[j]);
            width = j-i;
            maxArea = Math.max( height*width , maxArea);
            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return maxArea;
    }
}