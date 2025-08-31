class Solution {
    public int fib(int n) {
        if(n<2) return n;
        int a=0,b=1,fn=0;
        for(int i=2;i<=n;i++){
            fn = a+b;
            a = b;
            b = fn;
        }
        return fn;
    }
}