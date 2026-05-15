class Solution {
    public String reorderSpaces(String text) {

        // Count spaces
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        // Split words
        String[] words = text.trim().split("\\s+");

        String result = "";

        // If only one word
        if (words.length == 1) {

            result = words[0];

            for (int i = 0; i < spaces; i++) {
                result += " ";
            }
        }

        else {

            int gap = spaces / (words.length - 1);
            int extra = spaces % (words.length - 1);

            // Add words and spaces
            for (int i = 0; i < words.length; i++) {

                result += words[i];

                // Add spaces between words
                if (i != words.length - 1) {

                    for (int j = 0; j < gap; j++) {
                        result += " ";
                    }
                }
            }

            // Add extra spaces at end
            for (int i = 0; i < extra; i++) {
                result += " ";
            }
        }

        return result;
    }
}