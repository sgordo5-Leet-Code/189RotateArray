public class Solution3 {
    //Found this on the internet j1000singh on LeetCode
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] temp = new int[size];
        System.arraycopy(nums, 0, temp, 0, size);

        for(int i = 0; i < size; i++){
            nums[(i + k) % size] = temp[i];
        }
    }
}
