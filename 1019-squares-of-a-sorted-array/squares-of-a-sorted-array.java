class Solution {
    public int[] sortedSquares(int[] nums) {
        // https://www.youtube.com/watch?v=fikdT0AI5z4
        // TC: O(N) and SC: O(N)
        // Use two pointers approach, use left and right pointer
        // Check if the Absolute value of left pointer number is greater than the right pointer, 
        // if yes then add squares of left value in the position and increase the left pointer
        // if not add squares of right value in the position and decrease the right pointer
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        for (int pos = n - 1; pos >= 0; pos--) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}