
import java.util.*;

class Solution {
    public String frequencySort(String s) {

        // Step 1: Count frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Store unique characters
        ArrayList<Character> list = new ArrayList<>(map.keySet());

        // Step 3: Bubble Sort
        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = 0; j < list.size() - i - 1; j++) {

                char a = list.get(j);
                char b = list.get(j + 1);

                if (map.get(a) < map.get(b) ||
                   (map.get(a).equals(map.get(b)) && a > b)) {

                    list.set(j, b);
                    list.set(j + 1, a);
                }
            }
        }

        // Step 4: Build final String
        StringBuilder ans = new StringBuilder();

        for (char ch : list) {
            for (int i = 0; i < map.get(ch); i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
