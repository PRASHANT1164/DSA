
class Solution {
    public String longestCommonPrefix(String[] str) {

        String first = str[0];
        int max_index = Integer.MAX_VALUE;

        for (int i = 1; i < str.length; i++) {

            String current = str[i];
            int j = 0;

            while (j < first.length() && j < current.length()
                    && first.charAt(j) == current.charAt(j)) {
                j++;
            }

            max_index = Math.min(max_index, j);
        }

        if (max_index == Integer.MAX_VALUE) {
            return first;
        }

        return first.substring(0, max_index);
    }
}
