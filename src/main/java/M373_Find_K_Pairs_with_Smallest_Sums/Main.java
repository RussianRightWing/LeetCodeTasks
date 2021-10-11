package M373_Find_K_Pairs_with_Smallest_Sums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();
            if (k > nums1.length*nums2.length)
                k = nums1.length*nums2.length;
        for (int it1: nums1) {
            for (int it2 : nums2) {
                list.add(new ArrayList<>(Arrays.asList(it1, it2)));
            }
            Collections.sort(list, (o1, o2) -> {
                int a = o1.get(0) + o1.get(1) - o2.get(0) - o2.get(1);
                return a > 0 ? 1 : a < 0 ? -1 : 0;
            });
        }
        return new ArrayList<>(list.subList(0, k));
    }
}
