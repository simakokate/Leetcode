class Solution {
    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String cleaned = sb.toString();
        String rev = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(rev);
    }
}