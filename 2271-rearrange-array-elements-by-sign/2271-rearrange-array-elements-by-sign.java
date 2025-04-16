class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;
        for(int i : nums){
            if(i>=0){
                result[posIndex] = i;
                posIndex +=2;
            }
            else{
                result[negIndex] = i;
                negIndex +=2;
            }
        }
        return result;
    }
}