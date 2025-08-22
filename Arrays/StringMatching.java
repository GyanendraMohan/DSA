import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words1 = { "mass", "as", "hero", "superhero" };
        System.out.println(sol.stringMatching(words1)); // Output: [as, hero]
        String[] words2 = { "leetcode", "et", "code" };
        System.out.println(sol.stringMatching(words2)); // Output: [et, code]
        String[] words3 = { "blue", "green", "bu" };
        System.out.println(sol.stringMatching(words3)); // Output: []
    }
}
