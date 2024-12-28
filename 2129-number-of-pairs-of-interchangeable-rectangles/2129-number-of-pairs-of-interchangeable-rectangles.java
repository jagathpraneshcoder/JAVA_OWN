class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Integer> m = new HashMap<>();
        long freq=0;
        for(int i=0;i<rectangles.length;i++){
            double value = (double) rectangles[i][0]/rectangles[i][1];
            freq += m.getOrDefault( value , 0);
            m.put(value , m.getOrDefault( value , 0 ) + 1);
        }
        return freq;
    }
}