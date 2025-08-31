class Solution {
    public int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        if(n==0)
            return f0;
        if(n==1)
            return f1;
        int a = f0;
        int b = f1;
        int iterate = n;
        int fn = -1;
        while(iterate>=2){
            fn = a + b;
            a = b;
            b = fn;
            iterate--;
        }
        return fn;
    }
}