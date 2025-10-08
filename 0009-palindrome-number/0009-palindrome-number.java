class Solution {
    public boolean isPalindrome(int x) {
        String palindrome = Integer.toString(x);
        String reverse = new StringBuilder(palindrome).reverse().toString();
        return palindrome.equals(reverse);
    }
}