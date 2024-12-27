class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int[] lh = new int[n];
        int[] rh = new int[n];
        int trap = 0;
        for(int i = 0;i < n;i++){
            if(i==0) lh[i]=arr[i];
            else
            lh[i]=Math.max(lh[i-1],arr[i]);
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1) rh[i]=arr[i];
            else
            rh[i]=Math.max(rh[i+1],arr[i]);
        }
        for(int i=0;i<n;i++){
            trap+=Math.min(lh[i],rh[i])-arr[i];
        }


        /*for(int i=0;i<n;i++){
            int j=i;
            lh=0;rh=0;
            while(j>=0){
                lh=Math.max(lh,arr[j]);
                j--;
            }
            j=i;
            while(j<n){
                rh=Math.max(rh,arr[j]);
                j++;
            }
            trap+=Math.min(lh,rh)-arr[i];
        }*/
        return trap;
    }
}