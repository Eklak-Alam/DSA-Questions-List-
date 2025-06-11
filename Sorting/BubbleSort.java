import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 1, 3, 4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j+1);
                }
            }
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
