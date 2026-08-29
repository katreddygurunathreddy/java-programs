import java.util.*;

public class Solution {
    static String twoStrings(String s1, String s2) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            seen[s1.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (seen[s2.charAt(i) - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            System.out.println(twoStrings(s1, s2));
        }

        sc.close();
    }
}

output
Input 
2
hello
world
hi
world
Output 
YES
NO
