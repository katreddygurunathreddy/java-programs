class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }
}

OUTPUT
  Input
s =
"m"
goal =
"f"
Output
false
Expected
false
