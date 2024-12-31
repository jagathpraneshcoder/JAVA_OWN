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
        int sum=n;
        ArrayList<Integer> history = new ArrayList<>();
        while(sum>1){
            sum=findHappy(sum);
            if(sum!=1){
                if(history.contains(sum))
                    return false;
                else
                    history.add(sum);
            }
        }
        if(sum==1) return true;
        else return false;
    }
}