class Solution {
    public String baseNeg2(int n) {
       int rem=0;
       if(n==0) return "0";
       StringBuilder sb = new StringBuilder();
       while(n!=0){
            rem=n%(-2);
            n/=(-2);
            if(rem<0){
                rem+=2;
                n+=1;
            }
            sb.append(rem);
       } 

       return sb.reverse().toString();
    }
}