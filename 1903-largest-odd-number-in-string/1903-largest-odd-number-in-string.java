
class Solution {
    public String largestOddNumber(String num) {

        int right = -1;
        int left = 0;

        for (int i = num.length() - 1; i >= 0; i--) {

            int current = num.charAt(i) - '0';

            if (current % 2 != 0) {
                right = i;
                break;
            }
        }

        if (right == -1) {
            return "";
        }

        while (left < num.length() && num.charAt(left) == '0') {
            left++;
        }

        return num.substring(left, right + 1);
    }
}
