class Solution {
    public long interchangeableRectangles(int[][] a) {
 
        long count = 0;
        HashMap<Double,Integer> value = new HashMap<Double,Integer>();
        for(int i=0 ; i < a.length ; i++){
           double ratio = (double)a[i][0]/a[i][1];
           //Find the Rtion Whether present or not
           int freq = value.getOrDefault(ratio,0);
            //Get the value in the freq
           count+=(long)freq;
            //Add the Freq in the count
           value.put( ratio , freq + 1 );
             //Increment the Frequency
        }
       //If the unique ratio present the ratio doesnt repeatr else it will increment by one
        return count;
    }
}