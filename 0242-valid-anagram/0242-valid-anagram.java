import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        // Check lengths
        if (s.length() != t.length()) {
            return false;
        }

        // Convert to character arrays
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // Sort both arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // Compare arrays
        return Arrays.equals(sArr, tArr);
    }
}