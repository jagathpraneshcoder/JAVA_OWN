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
        int slow = n,fast = n;
        do{
            slow=findHappy(slow);
            fast=findHappy(fast);
            fast=findHappy(fast);
        }while(slow!=fast);
        if(slow==1) return true;
        else return false;
    }
}