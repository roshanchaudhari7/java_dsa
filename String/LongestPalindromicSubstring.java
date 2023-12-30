
//      5. Longest Palindromic Substring

package String;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;
        int length = 1;
        String ans = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + length; j <= s.length(); j++) {
                if (j - i > length && isPalindrome(s.substring(i, j))) {
                    length = j - i;
                    ans = s.substring(i, j);
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring is : " + longestPalindrome(s));
    }
}
