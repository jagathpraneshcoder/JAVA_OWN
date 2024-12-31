class Solution {
    public String convertToTitle(int columnNumber) {
        int digit=0;
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber=columnNumber-1;
            digit=columnNumber%26;
            columnNumber/=26;
            sb.append((char)('A'+digit));
        }
        return sb.reverse().toString();
    }
}