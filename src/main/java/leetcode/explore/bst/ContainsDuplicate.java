package leetcode.explore.bst;

import java.util.*;

public class ContainsDuplicate {

    // ContainsDuplicate1
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }

    // Contains Duplicate2
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res = Math.abs(map.get(nums[i]) - i) <= k;
                if (res)
                    return true;
            }
            map.put(nums[i], i);
        }
        return res;
    }
// Simpler approach make sure hash table size never exceeds the value of k.
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; ++i) {
//            if (set.contains(nums[i])) return true;
//            set.add(nums[i]);
//            if (set.size() > k) {
//                set.remove(nums[i - k]);
//            }
//        }
//        return false;
//    }

    // Contains Duplicate 3
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // Find the successor of current element
            Long s = set.ceiling((long) nums[i]);
            if (s != null && s <= nums[i] + t) return true;

            // Find the predecessor of current element
            Long g = set.floor((long) nums[i]);
            if (g != null && nums[i] <= g + t) return true;

            set.add((long) nums[i]);
            if (set.size() > k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
