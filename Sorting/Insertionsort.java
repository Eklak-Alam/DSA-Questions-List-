import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 4};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] nums) {
        int n = nums.length;

        for(int i = 1; i < n; i++) {
            int current = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
    }
}
