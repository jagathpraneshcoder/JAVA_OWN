class Solution {

    public int getMax(int[] freq){
        int max = freq[0];
        for(int i=0;i<26;i++){
            if(max < freq[i]){
                max = freq[i];
            }
        }
        return max;
    }

    public int getMin(int[] freq){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]!=0 && min > freq[i]){
                min = freq[i];
            }
        }
        return min;
    }

    public int beautySum(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']+=1;
                int max = getMax(freq);
                int min = getMin(freq);
                int beauty = max - min;
                sum+=beauty;
            }
        }
        return sum;
    }
}