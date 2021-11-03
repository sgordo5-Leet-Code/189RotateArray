import java.util.Arrays;

public class Solution {
    //create a for loop that runs for the number of items in nums. Have the new array index off set by rotation
    //and when it reaches the end of the array reset to the beginning.

    //does not work if the rotation is larger than the array size :(
    public void rotate(int[] nums, int k) {
        int index = k;
        int[] copy = Arrays.copyOf(nums, nums.length);

        for (int num : copy) {
            if (index == nums.length) {
                index = 0;
            }
            nums[index] = num;
            index++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
