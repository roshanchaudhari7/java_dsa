//      242. Valid Anagram

package String;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        int[] map = new int[26];

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            map[t.charAt(i) - 'a']--;
        }

        for (int ele : map) {
            if (ele != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}