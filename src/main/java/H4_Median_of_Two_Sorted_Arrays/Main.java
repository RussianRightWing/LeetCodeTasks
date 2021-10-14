package H4_Median_of_Two_Sorted_Arrays;

public class Main {
    public static void main(String[] args) {
        int[] r = new int[0];
        System.out.println((long) Math.ceil((double)1/2));

    }

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            long length = nums1.length + nums2.length;
            boolean isEvenLength = length % 2 == 0;
            long middle = (long) Math.ceil((double) length/2);
            int it1 = 0;
            int it2 = 0;
            int m1 = 0;
            int m2 = 0;
            boolean f1 = nums1.length != 0;
            boolean f2 = nums2.length != 0;

            while (it1 + it2 < middle) {
                if (f1 && f2) {
                    if (nums1[it1] < nums2[it2]) {
                        m2 = m1;
                        m1 = nums1[it1];
                        if (it1 != nums1.length - 1)
                            it1++;
                        else
                            f1 = false;
                    } else {
                        m2 = m1;
                        m1 = nums2[it2];
                        if (it2 != nums2.length - 1)
                            it2++;
                        else
                            f2 = false;
                    }
                } else if (f1) {
                    if (it2 + it1 + 1 == middle)
                        break;
                    m2 = m1;
                    m1 = nums1[it1];
                    it1++;
                } else if (f2) {
                    if (it2 + it1 + 1 == middle)
                        break;
                    m2 = m1;
                    m1 = nums2[it2];
                    it2++;
                }
            }

            if (isEvenLength)
                return (double)(m1 + m2) / 2;
            else
                return m1;
        }
    }
}
