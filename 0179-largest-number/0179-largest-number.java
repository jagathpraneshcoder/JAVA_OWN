class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        /*for(int i=0;i<nums.length;i++){
            System.out.println(s[0]);
        }*/
        if((s[0]).equals("0"))
            return "0";
        for(int i=0;i<s.length;i++){
            sb.append(s[i]);
        }
        return sb.toString();
    }
}