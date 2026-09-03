import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) return result;

        int[] pCount = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, window))
            result.add(0);

        for (int i = p.length(); i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            window[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pCount, window))
                result.add(i - p.length() + 1);
        }

        return result;
    }
}

output
Input
s =
"cbaebabacd"
p =
"abc"
Output
[0,6]
Expected
[0,6]
