class Solution {

    public int findHappy(int digit){
        int sum=0;
        while(digit>0){
            sum+=((digit%10)*(digit%10));
            digit=digit/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        do{ 
           n=findHappy(n);
        }while(n!=1 && n!=4);
        if(n==1) return true;
        else return false;
    }
}