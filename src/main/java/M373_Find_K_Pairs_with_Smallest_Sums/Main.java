package M373_Find_K_Pairs_with_Smallest_Sums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int[] r = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, r, 0, nums1.length);
        System.arraycopy(nums2, 0, r, nums1.length, nums2.length);
        Arrays.sort(r);
        if (k > r.length)
            k = r.length + 1;
        for (int i = 1; i < k; i++) {
            list.add(i - 1, Arrays.asList(r[0], r[i]));
        }
        return list;
    }
}
