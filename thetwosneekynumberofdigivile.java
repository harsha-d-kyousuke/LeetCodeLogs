import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int[] res = new int[2];
        int idx = 0;

        for (int n : nums) {
            if (seen.contains(n)) {
                res[idx++] = n;
            } else {
                seen.add(n);
            }
        }
        return res;
    }
}
