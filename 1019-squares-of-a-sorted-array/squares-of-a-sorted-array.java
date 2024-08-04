class Solution {
    public int[] sortedSquares(int[] nums) {
        // https://www.youtube.com/watch?v=fikdT0AI5z4
        // TC: O(N) and SC: O(N)
        // First loop thorugh the array and square the result
        // Then use two pointers approach, use left and right pointer
        // Check if the left pointer value is greater than the right pointer, 
        // if yes then add left value in the position and increase the left pointer
        // if not add right value in the position and decrease the right pointer
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int left = 0;
        int right = nums.length - 1;

        for (int pos = nums.length - 1; pos >= 0; pos--) {
            if (nums[left] > nums[right]) {
                result[pos] = nums[left];
                left++;
            } else {
                result[pos] = nums[right];
                right--;
            }
        }
        return result;
    }
}