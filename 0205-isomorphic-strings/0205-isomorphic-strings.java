class Solution {
    public boolean isIsomorphic(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        for (int i = 0; i < s1.length; i++) {

            // Check mapping from s to t
            if (map1.containsKey(s1[i])) {
                if (map1.get(s1[i]) != t1[i]) {
                    return false;
                }
            } else {
                map1.put(s1[i], t1[i]);
            }

            // Check mapping from t to s
            if (map2.containsKey(t1[i])) {
                if (map2.get(t1[i]) != s1[i]) {
                    return false;
                }
            } else {
                map2.put(t1[i], s1[i]);
            }
        }

        return true;
        
    }
}