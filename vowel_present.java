//FIND WETHER THE GIVE STRING CONSISTS VOWELS OR NOT?

import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String v = "aeiouAEIOU";
        int vowel=0;
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if(v.indexOf(t)!=-1)
            vowel+=1;
        }
        
        if(vowel!=0)
        System.out.println("vowel is present");
        else
        System.out.println("Not present");
    }
}
