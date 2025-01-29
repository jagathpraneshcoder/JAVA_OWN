class Solution {
    public int findContentChildren(int[] children, int[] cookies) {
        Arrays.sort(children);
        Arrays.sort(cookies);
        int child = 0;
        int cookie = 0;
        int  n = children.length;
        int m = cookies.length;
        int satisfy = 0;
        while(child < n && cookie < m){
            if(cookies[cookie] >= children[child] ){
                satisfy++;
                child++;
                cookie++;
            }
            else{
                cookie++;
            }
            
        }
        return satisfy;
    }
}