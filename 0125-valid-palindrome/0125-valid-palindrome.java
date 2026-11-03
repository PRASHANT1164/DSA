class Solution {
    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        String s1 = s.toLowerCase();

        while (start < end) {

    if (!Character.isLetterOrDigit(s1.charAt(start))) {
        start++;
    }
    else if (!Character.isLetterOrDigit(s1.charAt(end))) {
        end--;
    }
    else {
        if (s1.charAt(start) != s1.charAt(end)) {
            return false;
        }

        start++;
        end--;
    }
}
        return true;
    }
}