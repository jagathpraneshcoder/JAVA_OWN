class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        boolean flag = false;
        int i = 1;
        String words[] = sentence.split("\\s");
        for(String word : words){
            if(word.startsWith(searchWord)){
                flag= true;
                break;
            }
            i++;
        }
        return (flag==true)?i:-1;
    }
}