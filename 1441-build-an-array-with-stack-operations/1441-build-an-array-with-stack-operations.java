class Solution {
    public List<String> buildArray(int[] target, int n) {
         List<String> result = new ArrayList<>();
        int i = 0;

        for (int num = 1; num <= n; num++) {
            if (num == target[i]) {
                result.add("Push");
                i++;
                if (i == target.length) break;
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }
}