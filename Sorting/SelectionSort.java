import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 4, 1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] nums) {
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            int minIndex = i;

            for(int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
