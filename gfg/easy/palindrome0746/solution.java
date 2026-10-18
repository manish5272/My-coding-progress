class Solution {
    public boolean isPalindrome(int n) {

        int org = n;

        if (n < 0) {
            n = -n;
        }

        int rev = 0;

        while (n > 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }

        return Math.abs(org) == rev;
    }
}