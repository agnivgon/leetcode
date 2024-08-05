class Solution {
    public boolean containsDuplicate(int[] nums) {
        // TC: O(N) and SC: O(N)
        // Create a set, loop through the nums and check if the num present in the set
        // if present then it's repeating and duplicate otherwise add it in the set
        // At the end return false
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false; 
    }
}