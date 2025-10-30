class Solution {
    public int countValidOperations(int[] nums) {
        int count = 0, prev = -1;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num != 0 && num != prev) {
                count++;
                prev = num;
            }
        }
        return count;
    }
}
