import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1};
        int n = arr.length;

        // Move all zeros to the end of the array
        int count = 0; // Count of non-zero elements
        for(int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
