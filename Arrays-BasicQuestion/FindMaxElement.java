public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 23, 45, 43, 67, 76, 34, 87, 45, 99, 23};
        int n = arr.length;

        int max = arr[0];

        for(int i = 0; i < n; i++) {
            if ((arr[i] > max)) {
                max = arr[i];
            }
        }

        System.out.println("The maximum element in the array is: " + max);
    }
}