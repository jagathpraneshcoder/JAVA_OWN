class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean flag=false;
        if(num==0) return "0";
        else if(num==7) return "10";
        else if(num==-7) return "-10";
        if(num<0){
            num=num*-1;
            flag=true;
        }
        while(num>0){
            sb.append(num%7);
            num/=7;
        }
        if(flag){
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}