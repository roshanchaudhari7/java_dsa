
//      1768.Merge Strings Alternately

package String;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < n || i < m){
            if(i < n){
                ans.append(word1.charAt(i));
            }
            if(i < m){
                ans.append(word2.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println("The Merge String is : " + mergeAlternately(word1, word2));
    }
}
