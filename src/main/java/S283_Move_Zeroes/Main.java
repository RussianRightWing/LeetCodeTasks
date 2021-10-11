package S283_Move_Zeroes;

public class Main {
    public static void main(String[] args) {

    }
}

//class Solution {
//    public void moveZeroes(int[] nums) {
//        int zero = 0;
//        for (int i = 0; i < nums.length; i++)
//        {
//            if (nums[i] != 0 && zero != -1) {
//                nums[zero] = nums[i];
//                nums[i] = 0;
//                zero++;
//            }
//            if (nums[i] == 0 && zero == -1) {
//                zero = i;
//            }
//        }
//    }
//}

class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0 && zero != -1) {
                nums[zero] = nums[i];
                nums[i] = 0;
                zero++;
            }
            if (nums[i] == 0 && zero == -1) {
                zero = i;
            }
        }
    }
}
