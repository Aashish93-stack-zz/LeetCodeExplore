package leetcode.explore.array;

public class Introduction {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                counter += 1;
            else {
                max = Math.max(counter, max);
                counter = 0;
            }
        }
        max = Math.max(counter, max);
        return max;
    }

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i : nums) {
            String s = String.valueOf(i);
            result += s.length() % 2 == 0 ? 1 : 0;
        }
        return result;
    }


    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int end = nums.length - 1;
        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (r >= l) {
                res[end] = r;
                right--;
            } else {
                res[end] = l;
                left++;
            }
            end--;
        }
        return res;
    }


}
