//      455.Assign Cookies

package Array;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int ans = 0;
        for (int i : g) {
            while (j < s.length && s[j] < i) {
                j++;
            }
            if (j == s.length)
                return ans;
            else {
                j++;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] g = { 1, 2 };
        int[] s = { 1, 2, 3 };
        System.out.println(findContentChildren(g, s));
    }
}
