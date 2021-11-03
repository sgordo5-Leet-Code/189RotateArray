import java.util.Arrays;

public class Solution2 {
    // 37/38 cases succeed time limit exceeded error
    public void rotate(int[] nums, int k) {
        int p1;
        int p2 = nums[nums.length - 1];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length; j++) {
                p1 = nums[j];
                nums[j] = p2;
                p2 = p1;
            }
            p2 = nums[nums.length - 1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
