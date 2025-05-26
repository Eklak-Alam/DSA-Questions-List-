import java.util.Arrays;

public class SwapAlternative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        swapAlternative(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swapAlternative(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i+=2) {
            if (i + 1 < n) {
                swap(arr, i, i + 1);
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}