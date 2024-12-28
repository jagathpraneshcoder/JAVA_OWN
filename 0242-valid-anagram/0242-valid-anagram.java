import java.util.*;
class Solution {
    public static String sorting(String t){
        char[] T=t.toCharArray();
        Arrays.sort(T);
        return new String(T);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            String a=sorting(s);
            String b=sorting(t);
            if(a.equals(b))
            return true;
            else
            return false;
        }
    }
}