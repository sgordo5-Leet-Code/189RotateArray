public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {-1,-100,3,99};
        int[] array3 = {-1};

        solution.rotate(array1, 3);
        solution.rotate(array2, 2);
        solution.rotate(array3, 2);
    }
}
